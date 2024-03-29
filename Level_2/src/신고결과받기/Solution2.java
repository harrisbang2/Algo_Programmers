package 신고결과받기;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

class Solution {
  public int[] solution(String[] id_list, String[] report, int k) {
    int[] answer = new int[id_list.length];

    Map<String, ReportInfo> reportedInfo = getReportInfo(report);
    List<String> idList = java.util.Arrays.asList(id_list);

    for(ReportInfo info : reportedInfo.values()) {
      if (info.getReportedCnt() >= k){
        List<String> reportingUser = info.getReportingUser();

        for (String reportingUserId : reportingUser){
          int idIdx = idList.indexOf(reportingUserId);
          answer[idIdx]++;
        }
      }
    }
    return answer;
  }

  private Map<String, ReportInfo> getReportInfo(String[] report) {
    Map<String, ReportInfo> reportInfoMap = new HashMap<>();

    for(String item : report) {
      String reportingUser = item.split(" ")[0];
      String reportedUser = item.split(" ")[1];

      if (!reportInfoMap.containsKey(reportedUser)){
        ReportInfo reportInfo = new ReportInfo(reportedUser);
        reportInfo.reported(reportingUser);

        reportInfoMap.put(reportedUser, reportInfo);
      } else {
        reportInfoMap.get(reportedUser).reported(reportingUser);
      }
    }

    return reportInfoMap;
  }

  private class ReportInfo {
    private String id;
    private List<String> reportingUser;

    public ReportInfo (String id) {
      this.id = id;
      this.reportingUser = new ArrayList<>();
    }

    public String getId() { return this.id; }
    public int getReportedCnt() { return this.reportingUser.size(); }
    public List<String> getReportingUser() { return this.reportingUser; }

    public void reported(String reportingUserId){
      if(!includeReportingUser(reportingUserId)) {
        this.reportingUser.add(reportingUserId);
      }
    }
    public boolean includeReportingUser(String reportingUserId) {
      return this.reportingUser.contains(reportingUserId);
    }
  }
}
