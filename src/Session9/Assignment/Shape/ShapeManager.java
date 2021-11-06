package Session9.Assignment.Shape;

import java.util.ArrayList;

public class ShapeManager {
    private ArrayList<IShape> listShape;

    public ShapeManager() {
        this.listShape = new ArrayList<IShape>();
    }

    public ArrayList<IShape> getListShape() {
        return this.listShape;
    }

    public void setListShape(ArrayList<IShape> listShape) {
        this.listShape = listShape;
    }

    public boolean addShape(IShape shape) {
        if (shape != null) {
            return this.listShape.add(shape);
        }
        return false;
    }

    public ArrayList<IShape> timDsTheoTen(String name) {
        ArrayList<IShape> result = new ArrayList<IShape>();
        if (name == null) {
            return result;
        }
        for (IShape shape : this.listShape) {
            if (name.equalsIgnoreCase(((IShape) shape).getName())) {
                result.add(shape);
            }
        }
        return result;
    }

    public void xoaDsTheoLoai(String loai) {
        for (int i = 0; i < this.listShape.size(); i++) {
            if (loai.equalsIgnoreCase(this.listShape.get(i).getName())) {
                this.listShape.remove(this.listShape.get(i));
            }
        }
    }

    public void showDs() {
        for (IShape shape : this.listShape) {
            System.out.println(shape);
        }
    }
}
