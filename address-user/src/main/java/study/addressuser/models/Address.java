package study.addressuser.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import study.addressuser.dto.ViaCepResponse;

@Entity
public class Address {
    @Id
    private String cep;

    private String street;
    private String complement;
    private String neighborhood;
    private String city;
    private String state;
    private String ibge;
    private String gia;
    private String ddd;
    private String siafi;

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getIbge() {
        return ibge;
    }

    public void setIbge(String ibge) {
        this.ibge = ibge;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getSiafi() {
        return siafi;
    }

    public void setSiafi(String siafi) {
        this.siafi = siafi;
    }

    public static Address fromViaCepResponse(ViaCepResponse viaCepResponse) {
        Address address = new Address();
        address.setCep(viaCepResponse.getCep());
        address.setStreet(viaCepResponse.getLogradouro());
        address.setComplement(viaCepResponse.getComplemento());
        address.setNeighborhood(viaCepResponse.getBairro());
        address.setCity(viaCepResponse.getLocalidade());
        address.setState(viaCepResponse.getUf());
        address.setIbge(viaCepResponse.getIbge());
        address.setGia(viaCepResponse.getGia());
        address.setDdd(viaCepResponse.getDdd());
        address.setSiafi(viaCepResponse.getSiafi());
        return address;
    }
}

