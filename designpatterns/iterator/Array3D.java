import java.util.Iterator;
import java.util.NoSuchElementException;

class Array3D<T> implements Iterable<T> {

    private T [][][] array3d;
    private int currentPlate = 0;
    private int currentRow = 0;
    private int currentColumn = 0;

    public Array3D(T [][][] array3d) {
        this.array3d = array3d;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            @Override
            public boolean hasNext() {
                return (currentPlate < array3d.length && currentRow < array3d[currentPlate].length &&
                        currentColumn<array3d[currentPlate][currentRow].length);
            }

            @Override
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }

                T element = array3d[currentPlate][currentRow][currentColumn];
                currentColumn++;
                if (currentRow < array3d[currentPlate].length && currentColumn >= array3d[currentPlate][currentRow].length)
                {
                    currentColumn = 0;
                    currentRow++;
                    if (currentRow==array3d[currentPlate].length)
                    {
                        currentPlate++;
                        currentRow = 0;
                    }
                }
                return element;
            }
        };
    }
}

