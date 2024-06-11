package jspapp;

import daos.CandidateDao;
import daos.CandidateDaoImpl;
import daos.UserDao;
import daos.UserDaoImpl;

public class VoteBean {
	private int userId;
	private int candidateId;
	
	public VoteBean() {

	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getCandidateId() {
		return candidateId;
	}

	public void setCandidateId(int candidateId) {
		this.candidateId = candidateId;
	}
	
	public void voteCandidate() {
		int count=0;
		try(CandidateDao candDao = new CandidateDaoImpl()){
			count = candDao.incrementVote(candidateId);
			if(count!=0) {
				try(UserDao userDao = new UserDaoImpl()){
					userDao.updateStatus(userId, true);
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
