package org;

import javax.ejb.Stateful;
import java.io.Serializable;

/**
 * Created by al on 05.03.2016.
 */

@Stateful
public class StoreBean implements Serializable{

    private String description = "User name is not set";

    private String storedInfo = "";

    public String getStoredInfo() {
        return storedInfo;
    }

    public void setStoredInfo(String storedInfo) {
        this.storedInfo = storedInfo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
