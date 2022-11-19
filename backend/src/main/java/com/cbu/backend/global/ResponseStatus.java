package com.cbu.backend.global;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author 박현준
 *
 * 코드 규칙:
 * 헤드 네임은 각 서비스를 명시
 * 데이터에 대한 변경(예:생성, 수정, 삭제)은 0XX
 * 데이터에 대한 조회(예: 목록 조회, 단일 조회)는 1XX
 * 이후 코드 번호는 구현순으로
 */
@Getter
@AllArgsConstructor
public enum ResponseStatus {
    //게시판 (BOARD) 응답 상태
    //Head Name : BD
    POST_BOARD_SUCCESS("BD000", "게시판 업로드 성공"),
    UPDATE_BOARD_SUCCESS("BD001", "게시판 수정 성공"),
    DELETE_BOARD_SUCCESS("BD002", "게시판 삭제 성공"),
    GET_BOARD_LIST_SUCCESS("BD100", "게시판 목록 조회 성공"),
    GET_BOARD_SUCCESS("BD101", "게시판 조회 성공"),

    // 게시글(Article) 응답 상태
    // Head Name : A
    POST_ARTICLE_SUCCESS("A000", "게시글 업로드 성공"),
    UPDATE_ARTICLE_SUCCESS("A001", "게시글 수정 성공"),
    DELETE_ARTICLE_SUCCESS("A002", "게시글 삭제 성공"),
    GET_ARTICLE_LIST_SUCCESS("A100", "게시글 목록 조회 성공"),
    GET_ARTICLE_SUCCESS("A101", "게시글 조회 성공"),

    //게시글 댓글 (ArticleComment) 응답 상태
    // Head Name : AC
    POST_ARTICLECOMMENT_SUCCESS("AC000", "댓글 업로드 성공"),
    UPDATE_ARTICLECOMMENT_SUCCESS("AC001", "댓글 수정 성공"),
    DELETE_ARTICLECOMMENT_SUCCESS("AC002", "댓글 삭제 성공"),

    //책 (Book) 응답 상태
    // Head Name : B

    //북리뷰 (BookReview) 응답 상태
    // Head Name : BR
    POST_BOOKREVIEW_SUCCESS("BR000", "북리뷰 업로드 성공"),
    UPDATE_BOOKREVIEW_SUCCESS("BR001", "북리뷰 수정 성공"),
    DELETE_BOOKREVIEW_SUCCESS("BR002", "북리뷰 삭제 성공"),
    GET_BOOKREVIEW_LIST_SUCCESS("BR100", "북리뷰 목록 조회 성공"),
    GET_BOOKREVIEW_SUCCESS("BR101", "북리뷰 조회 성공"),



    // 스터디 활동일지 (StudyActivityLog) 응답 상태
    // Head Name : SAL

    // 스터디 그룹 (StudyGroup) 응답 상태
    // Head Name : SG
    GET_STUDYGROUP_LIST_SORTBY_CREATEDAT_SUCCESS("SG100", "스터디 최신순 조회 성공"),
    GET_STUDYGROUP_LIST_SORTBY_STUDYACTIVITYLOG_SUCCESS("SG101", "스터디 일지순 조회 성공"),
    GET_STUDYGROUP_LIST_SORTBY_LIKECOUNT_SUCCESS("SG102", "스터디 좋아요순 조회 성공"),
    GET_STUDYGROUP_SUCCESS("SG103", "스터디 조회 성공"),
    POST_STUDYGROUP_SUCCESS("SG000", "스터디 생성 성공"),
    PATCH_STUDYGROUP_LIKECOUNT_SUCCESS("SG001", "스터디 좋아요 업데이트 성공");



    // 스터디 계획 (StudyPlan) 응답 상태
    // Head Name : SP


    private final String code;
    private final String message;
}
