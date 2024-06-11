package jspapp;

import java.util.ArrayList;
import java.util.List;

import daos.CandidateDao;
import daos.CandidateDaoImpl;

public class CandidateListBean {
	private List<Candidate> candidateList;
	public CandidateListBean() {
		this.candidateList=new ArrayList<Candidate>();
	}
	public List<Candidate> getCandidateList() {
		return candidateList;
	}
	public void setCandidateList(List<Candidate> candidateList) {
		this.candidateList = candidateList;
	}
	
	public void fetchCandidate() {
		try(CandidateDao candDao = new CandidateDaoImpl()){
			candidateList = candDao.findAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
