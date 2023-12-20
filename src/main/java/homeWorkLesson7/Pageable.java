package homeWorkLesson7;

import java.util.ArrayList;
import java.util.List;

public class Pageable<T> {

    private List<T> data;

    private T someObject;
    private Pagination pagination;

    Pageable() {
        this.data = new ArrayList<>();
    }

    public void addElement(T element) {
        data.add(element);
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public Pagination getPagination() {
        return pagination;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }

}
