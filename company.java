package com.java.company;

/**
 * Created by swapanpreetkaur on 2/2/17.
 */
import java.util.ArrayList;
        import java.util.List;

/**
 * Created by swapanpreetkaur on 2/1/17.
 */

/**
 * Created by swapanpreetkaur on 1/25/17.
 */
public class company {

    int c_id;
    String c_name;
    String c_location;
    List<Department> departments_list;

    public company()
    {
        //this.c_name = c_name;
        //this.c_id=c_id;
        //this.c_location=c_location;
        departments_list = new ArrayList<>();

        //Department=new ArrayList<>();

    }
    public int getC_id()
    {
        return c_id;
    }

    public void setC_id(int c_id)
    {
        this.c_id = c_id;
    }

    public String getC_name()
    {
        return c_name;
    }

    public void setC_name(String c_name)
    {
        this.c_name = this.c_name;
    }

    public String getC_location(String c_location)
    {
        return c_location;
    }

        /*public void setC_location(String c_location)
        {
            this.c_location = c_location;
        }*/

    public List<Department> getDepartments_list()
    {
        return departments_list;
    }

    public void setDepartments_list(List<Department> departments_list)
    {
        this.departments_list = departments_list;
    }

    public void addDepts(Department department){
        departments_list.add(department);
    }


    public static company companyobject(int c_id, String c_name)
    {
        company c1 = new company();
        c1.setC_id(c_id);
        c1.setC_name(c_name);
        //c1.setC_location(c_location);

        return c1;
    }


}

