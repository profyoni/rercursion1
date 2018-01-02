package edu.touro.cs.mco264;


import java.util.HashMap;
import java.util.Map;

class Point{
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Point point = (Point) o;

        if (x != point.x) return false;
        return y == point.y;
    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        return result;
    }

    public int x,y;
    Point(int x, int y)
    {
        this.x = x; this.y = y;
    }


}

public class SparseArray<T> {
    private Map<Point,T> map = new HashMap<>();

    public T get(int x, int y){
        return map.get(new Point(x,y));
    }

    public void set(int x, int y, T t){
        map.put(new Point(x,y), t);
    }
}
