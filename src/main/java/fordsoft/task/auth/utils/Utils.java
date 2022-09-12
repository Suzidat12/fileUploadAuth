package fordsoft.task.auth.utils;

import fordsoft.task.auth.dto.Usersdto;
import fordsoft.task.auth.entity.Users;

import java.util.ArrayList;
import java.util.List;

public class Utils {
    public static Usersdto maptoUsersdto(Users mapfrom) {
        if (mapfrom == null) {
            return null;
        }
        Usersdto mapto = new Usersdto();
        mapto.setUsername(mapfrom.getUsername());
        mapto.setPassword(mapfrom.getPassword());
        mapto.setFirstname(mapfrom.getFullname());
        mapto.setLastname(mapfrom.getFullname());

        return mapto;
    }

    public static List<Usersdto> maptoUsersList(List<Users> mapfrom) {
        if (mapfrom == null) {
            return null;
        }
        List<Usersdto> list = new ArrayList<>();
        mapfrom.stream().forEach((rs) -> {
            list.add(maptoUsersdto(rs));
        });
        return list;
    }
}
