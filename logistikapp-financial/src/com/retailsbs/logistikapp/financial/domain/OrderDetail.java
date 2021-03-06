package com.retailsbs.logistikapp.financial.domain;

public class OrderDetail {
    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column lgk_order_detail.id_order_detail
     *
     * @abatorgenerated Tue Oct 03 16:24:25 CDT 2017
     */
    private Long id_order_detail;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column lgk_order_detail.id_order
     *
     * @abatorgenerated Tue Oct 03 16:24:25 CDT 2017
     */
    private Long id_order;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column lgk_order_detail.id_product
     *
     * @abatorgenerated Tue Oct 03 16:24:25 CDT 2017
     */
    private Long id_product;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column lgk_order_detail.price_sug
     *
     * @abatorgenerated Tue Oct 03 16:24:25 CDT 2017
     */
    private Double price_sug;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column lgk_order_detail.quantity
     *
     * @abatorgenerated Tue Oct 03 16:24:25 CDT 2017
     */
    private Integer quantity;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column lgk_order_detail.typetrx
     *
     * @abatorgenerated Tue Oct 03 16:24:25 CDT 2017
     */
    private String typetrx;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column lgk_order_detail.cost
     *
     * @abatorgenerated Tue Oct 03 16:24:25 CDT 2017
     */
    private Double cost;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column lgk_order_detail.price_sale
     *
     * @abatorgenerated Tue Oct 03 16:24:25 CDT 2017
     */
    private Double price_sale;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column lgk_order_detail.product_type
     *
     * @abatorgenerated Tue Oct 03 16:24:25 CDT 2017
     */
    private String product_type;
    
    private Integer tax;

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column lgk_order_detail.id_order_detail
     *
     * @return the value of lgk_order_detail.id_order_detail
     *
     * @abatorgenerated Tue Oct 03 16:24:25 CDT 2017
     */
    public Long getId_order_detail() {
        return id_order_detail;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column lgk_order_detail.id_order_detail
     *
     * @param id_order_detail the value for lgk_order_detail.id_order_detail
     *
     * @abatorgenerated Tue Oct 03 16:24:25 CDT 2017
     */
    public void setId_order_detail(Long id_order_detail) {
        this.id_order_detail = id_order_detail;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column lgk_order_detail.id_order
     *
     * @return the value of lgk_order_detail.id_order
     *
     * @abatorgenerated Tue Oct 03 16:24:25 CDT 2017
     */
    public Long getId_order() {
        return id_order;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column lgk_order_detail.id_order
     *
     * @param id_order the value for lgk_order_detail.id_order
     *
     * @abatorgenerated Tue Oct 03 16:24:25 CDT 2017
     */
    public void setId_order(Long id_order) {
        this.id_order = id_order;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column lgk_order_detail.id_product
     *
     * @return the value of lgk_order_detail.id_product
     *
     * @abatorgenerated Tue Oct 03 16:24:25 CDT 2017
     */
    public Long getId_product() {
        return id_product;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column lgk_order_detail.id_product
     *
     * @param id_product the value for lgk_order_detail.id_product
     *
     * @abatorgenerated Tue Oct 03 16:24:25 CDT 2017
     */
    public void setId_product(Long id_product) {
        this.id_product = id_product;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column lgk_order_detail.price_sug
     *
     * @return the value of lgk_order_detail.price_sug
     *
     * @abatorgenerated Tue Oct 03 16:24:25 CDT 2017
     */
    public Double getPrice_sug() {
        return price_sug;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column lgk_order_detail.price_sug
     *
     * @param price_sug the value for lgk_order_detail.price_sug
     *
     * @abatorgenerated Tue Oct 03 16:24:25 CDT 2017
     */
    public void setPrice_sug(Double price_sug) {
        this.price_sug = price_sug;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column lgk_order_detail.quantity
     *
     * @return the value of lgk_order_detail.quantity
     *
     * @abatorgenerated Tue Oct 03 16:24:25 CDT 2017
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column lgk_order_detail.quantity
     *
     * @param quantity the value for lgk_order_detail.quantity
     *
     * @abatorgenerated Tue Oct 03 16:24:25 CDT 2017
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column lgk_order_detail.typetrx
     *
     * @return the value of lgk_order_detail.typetrx
     *
     * @abatorgenerated Tue Oct 03 16:24:25 CDT 2017
     */
    public String getTypetrx() {
        return typetrx;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column lgk_order_detail.typetrx
     *
     * @param typetrx the value for lgk_order_detail.typetrx
     *
     * @abatorgenerated Tue Oct 03 16:24:25 CDT 2017
     */
    public void setTypetrx(String typetrx) {
        this.typetrx = typetrx;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column lgk_order_detail.cost
     *
     * @return the value of lgk_order_detail.cost
     *
     * @abatorgenerated Tue Oct 03 16:24:25 CDT 2017
     */
    public Double getCost() {
        return cost;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column lgk_order_detail.cost
     *
     * @param cost the value for lgk_order_detail.cost
     *
     * @abatorgenerated Tue Oct 03 16:24:25 CDT 2017
     */
    public void setCost(Double cost) {
        this.cost = cost;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column lgk_order_detail.price_sale
     *
     * @return the value of lgk_order_detail.price_sale
     *
     * @abatorgenerated Tue Oct 03 16:24:25 CDT 2017
     */
    public Double getPrice_sale() {
        return price_sale;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column lgk_order_detail.price_sale
     *
     * @param price_sale the value for lgk_order_detail.price_sale
     *
     * @abatorgenerated Tue Oct 03 16:24:25 CDT 2017
     */
    public void setPrice_sale(Double price_sale) {
        this.price_sale = price_sale;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column lgk_order_detail.product_type
     *
     * @return the value of lgk_order_detail.product_type
     *
     * @abatorgenerated Tue Oct 03 16:24:25 CDT 2017
     */
    public String getProduct_type() {
        return product_type;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column lgk_order_detail.product_type
     *
     * @param product_type the value for lgk_order_detail.product_type
     *
     * @abatorgenerated Tue Oct 03 16:24:25 CDT 2017
     */
    public void setProduct_type(String product_type) {
        this.product_type = product_type;
    }
    

   public Integer getTax() {
       return tax;
   }


   public void setTax(Integer tax) {
       this.tax = tax;
   }
}