package pl.ilonaptak.Donation.user;

import lombok.Getter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.Collection;

@Getter
public class CurrentUser extends User {

    private final pl.ilonaptak.Donation.user.User user;


    public CurrentUser(String login, String password, Collection<? extends GrantedAuthority> authorities, pl.ilonaptak.Donation.user.User user) {
        super(login, password, authorities);
        this.user = user;
    }

}
