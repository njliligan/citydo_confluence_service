package cn.gingost.security.domain;

import cn.gingost.system.entity.Dept;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.stream.Collectors;

/**
 * @author:lezzy
 * @Date:2020/7/27 17:34
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JwtUser implements UserDetails {
    private Long id;
    private String username;
    @JsonIgnore
    private String password;
    private String type;
    private String phone;
    private String email;
    private String card;
    private Dept dept;
    private Collection<GrantedAuthority> authorities;


    @Override
    @JsonIgnore
    public String getPassword() {
        return password;
    }

    @Override
    @JsonIgnore
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
