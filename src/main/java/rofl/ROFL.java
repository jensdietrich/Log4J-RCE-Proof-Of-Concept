package rofl;

import java.io.IOException;
import java.io.Serializable;

public class ROFL implements Serializable {

	static {
		try {
			Runtime.getRuntime().exec("touch foo");
		} catch (IOException x) {
			throw new RuntimeException(x);
		}
	}
}
