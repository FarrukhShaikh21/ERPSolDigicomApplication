package dgcom.view.appbean;

import java.util.ArrayList;
import java.util.List;

public class TreeElement {
    private String name;

    public TreeElement(String name, String loc, String is_added, int totChild, String filename, String description) {
        this.name = name;

        this.location = loc;
        this.is_added = is_added;
        this.filename = filename;
        this.totChild = totChild;
        this.description=description;

        directs = new ArrayList<TreeElement>();
    }
    private String location;
    private String is_added;
    private String filename;
    private String description;

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getFilename() {
        return filename;
    }
    private int totChild;

    public synchronized void setTotChild(int totChild) {
        this.totChild = totChild;
    }

    public synchronized int getTotChild() {
        return totChild;
    }

    public  void setIs_added(String is_added) {
        this.is_added = is_added;
    }

    public  String getIs_added() {
        return is_added;
    }
    private List<TreeElement> directs;

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public List<TreeElement> getDirects() {
        return directs;
    }
    
    public void addDirect(TreeElement emp){
        directs.add(emp);
    }
}