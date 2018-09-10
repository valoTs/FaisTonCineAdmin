package DAO;

import java.util.List;

import Bean.Idea;

public interface DaoIdeaService {

	public List<Idea> getALL();
	public List<Idea> OByIdUser();
	public List<Idea>OByLibelle();
	public List<Idea>OByDiffusable();
	public List<Idea>OByDate();
}
