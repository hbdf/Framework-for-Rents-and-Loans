package controle;

import java.util.ArrayList;

public class TiposMateriais implements ITiposMaterial{
	@Override
	public ArrayList<String> getTipos() {
		ArrayList<String> ans = new ArrayList<String>();
		ans.add("Mat1");
		ans.add("Mat2");
		ans.add("Mat3");
		return ans;
	}
}
