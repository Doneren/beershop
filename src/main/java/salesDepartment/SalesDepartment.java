package salesDepartment;

import interfaces.SalesDepartmentInterface;

public class SalesDepartment implements SalesDepartmentInterface{
    private String name;
    private String position;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }


}
