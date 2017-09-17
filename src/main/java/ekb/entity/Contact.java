package ekb.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;


@Embeddable
public class Contact {

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
