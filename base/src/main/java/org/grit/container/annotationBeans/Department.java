package org.grit.container.annotationBeans;

public class Department {

    //员工
    private Employee employee;

    //部门ID
    private long departMentId;

    //部门
    private String departMent;

    //上级部门
    private String superDepartMent;

    //下级部门
    private String subDepartMent;

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public long getDepartMentId() {
        return departMentId;
    }

    public void setDepartMentId(long departMentId) {
        this.departMentId = departMentId;
    }

    public String getDepartMent() {
        return departMent;
    }

    public void setDepartMent(String departMent) {
        this.departMent = departMent;
    }

    public String getSuperDepartMent() {
        return superDepartMent;
    }

    public void setSuperDepartMent(String superDepartMent) {
        this.superDepartMent = superDepartMent;
    }

    public String getSubDepartMent() {
        return subDepartMent;
    }

    public void setSubDepartMent(String subDepartMent) {
        this.subDepartMent = subDepartMent;
    }
}
