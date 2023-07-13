package kodlama.io.Teacher.core.utilites;

import kodlama.io.Teacher.business.requests.AddTechnology;

public interface ITechnologyControl {
	public boolean isValid(AddTechnology addTechnology) throws Exception;
}
