package i.t.p;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import i.t.c.kernel.RoleService;
import i.t.c.model.Role;

public class RoleServiceImp implements RoleService {

	public List<Role> queryAll() {
		// TODO Auto-generated method stub
		List<Role> listRole = new ArrayList<Role>();
		for (int i = 0; i < 10; i++) {
			Role role = new Role();
			role.name="name"+i;
			role.age = i +10;
			listRole.add(role);
		}
		return listRole;
	}

}
