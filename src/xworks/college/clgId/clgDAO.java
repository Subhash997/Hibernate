package xworks.college.clgId;

import xworks.college.CollegeDTO;

public interface clgDAO {
 void saveCollege(CollegeDTO collegeDTO);
 void fetchCollege(int collegeID);
 void updateCollege(int collegeID);

}
