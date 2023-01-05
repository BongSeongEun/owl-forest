package com.cbu.backend.studygroup.dto.response;

import com.cbu.backend.studyactivitylog.dto.response.StudyActivityLogResponse;
import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

/**
 * 스터디 그룹에 대한 Response DTO
 *
 * @author ohksj(김승진)
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StudyGroupResponse {
  private String name;
  private String summary;
  private StudyGroupMemberResponse studyGroupLeader;
  private List<StudyGroupMemberResponse> studyGroupMembers = new ArrayList<>();
  private Boolean isActive;
  private Integer likeCount;
  private Integer season;
  private List<StudyActivityLogResponse> studyActivityLogs = new ArrayList<>();
}
