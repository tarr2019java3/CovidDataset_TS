package pl.sda.coviddataset;
//Sno,Date,Province/State,Country,Last Update,Confirmed,Deaths,Recovered
public class Record {
    private Integer sno;
    private String data;
    private String province;
    private String country;
    private String latUpdate;
    private Double confirmed;
    private Double deaths;
    private Double recovered;


    public Record(Integer sno, String data, String province, String country, String latUpdate, Double confirmed, Double deaths, Double recovered) {
        this.sno = sno;
        this.data = data;
        this.province = province;
        this.country = country;
        this.latUpdate = latUpdate;
        this.confirmed = confirmed;
        this.deaths = deaths;
        this.recovered = recovered;
    }

    public Record() {
    }

    public Integer getSno() {
        return sno;
    }

    public void setSno(Integer sno) {
        this.sno = sno;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLatUpdate() {
        return latUpdate;
    }

    public void setLatUpdate(String latUpdate) {
        this.latUpdate = latUpdate;
    }

    public Double getConfirmed() {
        return confirmed;
    }

    public void setConfirmed(Double confirmed) {
        this.confirmed = confirmed;
    }

    public Double getDeaths() {
        return deaths;
    }

    public void setDeaths(Double deaths) {
        this.deaths = deaths;
    }

    public Double getRecovered() {
        return recovered;
    }

    public void setRecovered(Double recovered) {
        this.recovered = recovered;
    }
}
