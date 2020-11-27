import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static ArrayList<ArrayList<Point>> parseListOfStrings(List<String> listOfStrings) {
        List<List<String>> filteredList = listOfStrings.stream()
                                                    .filter(x -> x.matches("-?[0-9]+ -?[0-9]+ -?[0-9]+ -?[0-9]+ -?[0-9]+ -?[0-9]"))
                                                    .map(x -> Arrays.asList(x.split(" ")))
                                                    .filter(x -> x.size() == 6)
                                                    .collect(Collectors.toList());

        List<List<Double>> convertedFilteredList = filteredList.stream()
                                                                .map(list -> list.stream()
                                                                                .map(Double::parseDouble)
                                                                                .collect(Collectors.toList()))
                                                                .collect(Collectors.toList());

        ArrayList<ArrayList<Point>> listOfPoints = new ArrayList<ArrayList<Point>>();
        for (List<Double> list : convertedFilteredList) {

            Point point_1 = new Point(list.get(0), list.get(1));
            Point point_2 = new Point(list.get(2), list.get(3));
            Point point_3 = new Point(list.get(4), list.get(5));

            listOfPoints.add(new ArrayList<Point>(Arrays.asList(point_1, point_2, point_3)));
        }

        return listOfPoints;
    }

    public static List<Triangle> getListOfTriangles(ArrayList<ArrayList<Point>> listOfPoints) {
        List<Triangle> listOfTriangles = listOfPoints.stream()
                                                     .map(list -> new Triangle(list.get(0),
                                                                               list.get(1),
                                                                               list.get(2)))
                                                     .collect(Collectors.toList());
        return listOfTriangles;
    }

    public static List<Triangle> getIsoscelesTriangleWithMaxSquare(List<Triangle> listOfTriangles) {
        return listOfTriangles.stream()
                .sorted(Comparator.comparingDouble(Triangle::getSquare))
                .limit(1)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) throws IOException {

        List<String> listOfStrings = ReadWriteUtil.read(args[1]);
        ArrayList<ArrayList<Point>> listOfPoints = parseListOfStrings(listOfStrings);
        List<Triangle> listOfTriangles = getListOfTriangles(listOfPoints);

        if (listOfTriangles.size() != 0) {
            ReadWriteUtil.write(args[2], getIsoscelesTriangleWithMaxSquare(listOfTriangles).get(0).toString());
        } else {
            ReadWriteUtil.write(args[2], "");
        }
    }
}