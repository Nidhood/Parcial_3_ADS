package com.javeriana.aplicacionhostal.modelo;

import com.javeriana.aplicacionhostal.controlador.Hostel;

import java.util.ArrayList;
import java.util.List;

public class TenantList {
    // Attributes:
    public int MAX;
    private List<Tenant> tenantList = new ArrayList<>();
    private Hostel hostel = new Hostel();
    // Constructors:
    public TenantList() {
    }
    public TenantList(int MAX, List<Tenant> tenantList, Hostel hostel) {
        this.MAX = MAX;
        this.tenantList = tenantList;
        this.hostel = hostel;
    }
    // Getters and setters:
    public int getMAX() {
        return MAX;
    }
    public void setMAX(int MAX) {
        this.MAX = MAX;
    }
    public List<Tenant> getTenantList() {
        return tenantList;
    }
    public void setTenantList(List<Tenant> tenantList) {
        this.tenantList = tenantList;
    }
    public Hostel getHostel() {
        return hostel;
    }
    public void setHostel(Hostel hostel) {
        this.hostel = hostel;
    }
    // Methods:
    public boolean addTenant(Tenant tenant) {
        return true;
    }
    public Tenant getTenant(int tenantNumber) {
        Tenant tenant = new Tenant();
        return tenant;
    }
    public boolean isEmpty() {
        return true;
    }
    public boolean isFull() {
        return true;
    }
    public boolean removeTenant(int tenantNumber) {
        return true;
    }
    public Tenant search(int tenantNumber) {
        Tenant tenant = new Tenant();
        return tenant;
    }
}
