package com.retailsbs.logistikapp.financial.domain;

import java.util.Date;

public class Order {
    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column lgk_order.id_order
     *
     * @abatorgenerated Thu Aug 18 11:32:18 CDT 2016
     */
    private Long id_order;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column lgk_order.id_supplier
     *
     * @abatorgenerated Thu Aug 18 11:32:18 CDT 2016
     */
    private Long id_supplier;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column lgk_order.modified
     *
     * @abatorgenerated Thu Aug 18 11:32:18 CDT 2016
     */
    private Date modified;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column lgk_order.invoice
     *
     * @abatorgenerated Thu Aug 18 11:32:18 CDT 2016
     */
    private Date invoice;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column lgk_order.delivery
     *
     * @abatorgenerated Thu Aug 18 11:32:18 CDT 2016
     */
    private Date delivery;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column lgk_order.status
     *
     * @abatorgenerated Thu Aug 18 11:32:18 CDT 2016
     */
    private String status;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column lgk_order.id_retail
     *
     * @abatorgenerated Thu Aug 18 11:32:18 CDT 2016
     */
    private Long id_retail;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column lgk_order.id_store
     *
     * @abatorgenerated Thu Aug 18 11:32:18 CDT 2016
     */
    private Long id_store;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column lgk_order.id_user
     *
     * @abatorgenerated Thu Aug 18 11:32:18 CDT 2016
     */
    private Long id_user;

    private Double payment_part;
    
    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column lgk_order.id_order
     *
     * @return the value of lgk_order.id_order
     *
     * @abatorgenerated Thu Aug 18 11:32:18 CDT 2016
     */
    public Long getId_order() {
        return id_order;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column lgk_order.id_order
     *
     * @param id_order the value for lgk_order.id_order
     *
     * @abatorgenerated Thu Aug 18 11:32:18 CDT 2016
     */
    public void setId_order(Long id_order) {
        this.id_order = id_order;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column lgk_order.id_supplier
     *
     * @return the value of lgk_order.id_supplier
     *
     * @abatorgenerated Thu Aug 18 11:32:18 CDT 2016
     */
    public Long getId_supplier() {
        return id_supplier;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column lgk_order.id_supplier
     *
     * @param id_supplier the value for lgk_order.id_supplier
     *
     * @abatorgenerated Thu Aug 18 11:32:18 CDT 2016
     */
    public void setId_supplier(Long id_supplier) {
        this.id_supplier = id_supplier;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column lgk_order.modified
     *
     * @return the value of lgk_order.modified
     *
     * @abatorgenerated Thu Aug 18 11:32:18 CDT 2016
     */
    public Date getModified() {
        return modified;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column lgk_order.modified
     *
     * @param modified the value for lgk_order.modified
     *
     * @abatorgenerated Thu Aug 18 11:32:18 CDT 2016
     */
    public void setModified(Date modified) {
        this.modified = modified;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column lgk_order.invoice
     *
     * @return the value of lgk_order.invoice
     *
     * @abatorgenerated Thu Aug 18 11:32:18 CDT 2016
     */
    public Date getInvoice() {
        return invoice;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column lgk_order.invoice
     *
     * @param invoice the value for lgk_order.invoice
     *
     * @abatorgenerated Thu Aug 18 11:32:18 CDT 2016
     */
    public void setInvoice(Date invoice) {
        this.invoice = invoice;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column lgk_order.delivery
     *
     * @return the value of lgk_order.delivery
     *
     * @abatorgenerated Thu Aug 18 11:32:18 CDT 2016
     */
    public Date getDelivery() {
        return delivery;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column lgk_order.delivery
     *
     * @param delivery the value for lgk_order.delivery
     *
     * @abatorgenerated Thu Aug 18 11:32:18 CDT 2016
     */
    public void setDelivery(Date delivery) {
        this.delivery = delivery;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column lgk_order.status
     *
     * @return the value of lgk_order.status
     *
     * @abatorgenerated Thu Aug 18 11:32:18 CDT 2016
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column lgk_order.status
     *
     * @param status the value for lgk_order.status
     *
     * @abatorgenerated Thu Aug 18 11:32:18 CDT 2016
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column lgk_order.id_retail
     *
     * @return the value of lgk_order.id_retail
     *
     * @abatorgenerated Thu Aug 18 11:32:18 CDT 2016
     */
    public Long getId_retail() {
        return id_retail;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column lgk_order.id_retail
     *
     * @param id_retail the value for lgk_order.id_retail
     *
     * @abatorgenerated Thu Aug 18 11:32:18 CDT 2016
     */
    public void setId_retail(Long id_retail) {
        this.id_retail = id_retail;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column lgk_order.id_store
     *
     * @return the value of lgk_order.id_store
     *
     * @abatorgenerated Thu Aug 18 11:32:18 CDT 2016
     */
    public Long getId_store() {
        return id_store;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column lgk_order.id_store
     *
     * @param id_store the value for lgk_order.id_store
     *
     * @abatorgenerated Thu Aug 18 11:32:18 CDT 2016
     */
    public void setId_store(Long id_store) {
        this.id_store = id_store;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column lgk_order.id_user
     *
     * @return the value of lgk_order.id_user
     *
     * @abatorgenerated Thu Aug 18 11:32:18 CDT 2016
     */
    public Long getId_user() {
        return id_user;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column lgk_order.id_user
     *
     * @param id_user the value for lgk_order.id_user
     *
     * @abatorgenerated Thu Aug 18 11:32:18 CDT 2016
     */
    public void setId_user(Long id_user) {
        this.id_user = id_user;
    }
    
    public Double getPayment_part() {
        return payment_part;
    }

    public void setPayment_part(Double payment_part) {
        this.payment_part = payment_part;
    }
}