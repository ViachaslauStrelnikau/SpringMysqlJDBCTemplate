public class goods {
    String code;
    String name;
    int quan;
    String ed;
    int weight;
    String invoice;
    goods()
    {
        code="";
        name="";
        quan=0;
        ed="";
        weight=0;
        invoice="";
    }
    void setCode(String code)
    {this.code=code;}

    void setName(String name)
    {this.name=name;}
    void setQuan(int q)
    {this.quan=q;}
    void setEd(String ed)
    {this.ed=ed;}
    void setWeight(int w)
    {this.weight=w;}
    void setInvoice(String inv)
    {this.invoice=inv;}

@Override
    public String toString()
    {
        return code+"\t"+name+"\t"+quan+"\t"+ed+"\t"+weight+"\t"+invoice;
    }
}
