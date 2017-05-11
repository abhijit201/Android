package com.example.deeks.onetoone.model;

import android.support.v7.widget.RecyclerView;

/**
 * Created by Deeks on 5/2/2017.
 */

public class Temporary_Adapter {
    private String ServiceName;

    public Temporary_Adapter() {
    }

    public Temporary_Adapter(String serviceName) {
        this.ServiceName = serviceName;
    }

    public String getServiceName() {
        return ServiceName;
    }

    public void setServiceName(String serviceName) {
        this.ServiceName = serviceName;
    }

}
