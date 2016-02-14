package org;

import javax.ejb.Remote;
import javax.ejb.Stateful;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by al on 14.02.2016.
 */
@Remote
@Stateful
public class DataBean {

    private String commonData = "Stateful bean data from org package";

    private Map<String, String> mapData = new HashMap<>();

    private List<String> listData = new ArrayList<>();

    public DataBean() {
        mapData.put("option one", "value one");
        mapData.put("option 2", "value two");
        mapData.put("option three", "weird value");
        mapData.put("option five", "5");
        mapData.put("option 6", "six");

        listData.add("H");
        listData.add("e");
        listData.add("l");
        listData.add("l");
        listData.add("o");
        listData.add(" ");
        listData.add("f");
        listData.add("r");
        listData.add("o");
        listData.add("m");
        listData.add(" ");
        listData.add("E");
        listData.add("J");
        listData.add("B");
    }

    public Map<String, String> getMapData() {
        return mapData;
    }

    public void setMapData(Map<String, String> mapData) {
        this.mapData = mapData;
    }

    public String getCommonData() {
        return commonData;
    }

    public List<String> getListData() {
        return listData;
    }

    public void setListData(List<String> listData) {
        this.listData = listData;
    }

    public void setCommonData(String commonData) {
        this.commonData = commonData;
    }

}
