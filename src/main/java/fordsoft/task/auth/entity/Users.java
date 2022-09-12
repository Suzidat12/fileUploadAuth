/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fordsoft.task.auth.entity;

import lombok.Data;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author OLASUNKANMI
 */
@Entity
@Table(name = "users")
@Data
public class Users implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;
    @Column(name = "fullname")
    private String fullname;
    @Column(name = "appid")
    private BigInteger appid;
    @Column(name = "datecreated")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datecreated;

    @OneToMany(mappedBy = "userid", cascade = CascadeType.ALL)
    private List<Roleusers> roleusersList;

    @JoinColumn(name = "roleId", referencedColumnName = "id")
    @ManyToOne
    private Roles roleId;

    public Users() {
    }

    public Users(Long id) {
        this.id = id;
    }


}
