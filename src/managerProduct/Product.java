package managerProduct;

public class Product {
    private int idProduct;
    private String nameProduct;
    private String companyPruduct;
    private String priceProduct;

    public Product() {
    }

    public Product(int idProduct, String nameProduct, String companyPruduct, String priceProduct) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.companyPruduct = companyPruduct;
        this.priceProduct = priceProduct;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getCompanyPruduct() {
        return companyPruduct;
    }

    public void setCompanyPruduct(String companyPruduct) {
        this.companyPruduct = companyPruduct;
    }

    public String getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(String priceProduct) {
        this.priceProduct = priceProduct;
    }

    @Override
    public String toString() {
        return "Product{" +
                "idProduct=" + idProduct +
                ", nameProduct='" + nameProduct + '\'' +
                ", companyPruduct='" + companyPruduct + '\'' +
                ", priceProduct='" + priceProduct + '\'' +
                '}';
    }
}
