package kodlama.io.Teacher.business.abstracts;

import java.util.List;

import kodlama.io.Teacher.business.requests.AddTechnology;
import kodlama.io.Teacher.business.requests.UpdateTechnology;
import kodlama.io.Teacher.business.responses.GetAllTechnology;

public interface ITechnologyService {
	public void add(AddTechnology addTechnology)throws Exception;
	public void remove(int id);
	public void update(UpdateTechnology technology) throws Exception;
	public List<GetAllTechnology> getall();
}
