package com.infinity.infoway.atmiya.student.exam.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CheckIsStudentFromAtmiyaUniOrNotPojo {

    @SerializedName("Table")
    @Expose
    private List<Table> table = null;

    public List<Table> getTable() {
        return table;
    }

    public void setTable(List<Table> table) {
        this.table = table;
    }

    public class Table {

        @SerializedName("Stud_id")
        @Expose
        private Integer studId;
        @SerializedName("Stud_inquiry_no")
        @Expose
        private Object studInquiryNo;
        @SerializedName("Stud_aits_stud_id")
        @Expose
        private Integer studAitsStudId;
        @SerializedName("Stud_Enrollment_no")
        @Expose
        private String studEnrollmentNo;
        @SerializedName("Stud_admission_no")
        @Expose
        private String studAdmissionNo;
        @SerializedName("stud_main_school_id")
        @Expose
        private Integer studMainSchoolId;
        @SerializedName("Stud_admission_year")
        @Expose
        private Integer studAdmissionYear;
        @SerializedName("Stud_year_id")
        @Expose
        private Integer studYearId;
        @SerializedName("Stud_Prefix")
        @Expose
        private Object studPrefix;
        @SerializedName("Stud_first_name")
        @Expose
        private String studFirstName;
        @SerializedName("Stud_Middle_name")
        @Expose
        private String studMiddleName;
        @SerializedName("Stud_last_name")
        @Expose
        private Object studLastName;
        @SerializedName("Stud_Join_date")
        @Expose
        private String studJoinDate;
        @SerializedName("Stud_gender")
        @Expose
        private Integer studGender;
        @SerializedName("Stud_date_of_birth")
        @Expose
        private Object studDateOfBirth;
        @SerializedName("stud_bdate")
        @Expose
        private String studBdate;
        @SerializedName("stud_blood_group")
        @Expose
        private Integer studBloodGroup;
        @SerializedName("stud_category")
        @Expose
        private Integer studCategory;
        @SerializedName("stud_adhar_no")
        @Expose
        private String studAdharNo;
        @SerializedName("stud_uid_no")
        @Expose
        private Object studUidNo;
        @SerializedName("stud_admission_type")
        @Expose
        private Integer studAdmissionType;
        @SerializedName("stud_fee_type")
        @Expose
        private Integer studFeeType;
        @SerializedName("stud_quata")
        @Expose
        private Integer studQuata;
        @SerializedName("stud_shift")
        @Expose
        private Integer studShift;
        @SerializedName("Stud_course_id")
        @Expose
        private Integer studCourseId;
        @SerializedName("stud_sem_id")
        @Expose
        private Object studSemId;
        @SerializedName("stud_birth_place")
        @Expose
        private Object studBirthPlace;
        @SerializedName("Stud_religion")
        @Expose
        private Object studReligion;
        @SerializedName("Stud_school_name")
        @Expose
        private Object studSchoolName;
        @SerializedName("Stud_standard_id")
        @Expose
        private Object studStandardId;
        @SerializedName("Stud_board")
        @Expose
        private Object studBoard;
        @SerializedName("Stud_medium")
        @Expose
        private Object studMedium;
        @SerializedName("Stud_stream")
        @Expose
        private Object studStream;
        @SerializedName("stud_nationality")
        @Expose
        private Object studNationality;
        @SerializedName("stud_cast")
        @Expose
        private Integer studCast;
        @SerializedName("stud_sub_cast")
        @Expose
        private Object studSubCast;
        @SerializedName("Stud_last_year_result")
        @Expose
        private Object studLastYearResult;
        @SerializedName("Stud_photo")
        @Expose
        private String studPhoto;
        @SerializedName("stud_result")
        @Expose
        private Object studResult;
        @SerializedName("Stud_user_name")
        @Expose
        private String studUserName;
        @SerializedName("Stud_password")
        @Expose
        private Object studPassword;
        @SerializedName("Stud_Address")
        @Expose
        private String studAddress;
        @SerializedName("Stud_Current_Address")
        @Expose
        private Object studCurrentAddress;
        @SerializedName("Stud_city")
        @Expose
        private Integer studCity;
        @SerializedName("Stud_pin_no")
        @Expose
        private String studPinNo;
        @SerializedName("Stud_state")
        @Expose
        private Object studState;
        @SerializedName("Stud_Country")
        @Expose
        private Object studCountry;
        @SerializedName("Stud_Land_line_no")
        @Expose
        private Object studLandLineNo;
        @SerializedName("Stud_mobile_no")
        @Expose
        private String studMobileNo;
        @SerializedName("Stud_email")
        @Expose
        private String studEmail;
        @SerializedName("stud_emer_no")
        @Expose
        private Object studEmerNo;
        @SerializedName("stud_other_phone")
        @Expose
        private Object studOtherPhone;
        @SerializedName("stud_right_chield")
        @Expose
        private Object studRightChield;
        @SerializedName("Stud_father_name")
        @Expose
        private String studFatherName;
        @SerializedName("Stud_father_mobile_no")
        @Expose
        private String studFatherMobileNo;
        @SerializedName("Stud_Father_email")
        @Expose
        private Object studFatherEmail;
        @SerializedName("Stud_Father_Education")
        @Expose
        private Object studFatherEducation;
        @SerializedName("Stud_father_Occupation")
        @Expose
        private Object studFatherOccupation;
        @SerializedName("Stud_Parent_Anniversary")
        @Expose
        private Object studParentAnniversary;
        @SerializedName("Stud_mother_name")
        @Expose
        private Object studMotherName;
        @SerializedName("Stud_mother_Mobile_no")
        @Expose
        private Object studMotherMobileNo;
        @SerializedName("Stud_mother_Email")
        @Expose
        private Object studMotherEmail;
        @SerializedName("Stud_mother_Education")
        @Expose
        private Object studMotherEducation;
        @SerializedName("Stud_Mother_Occupation")
        @Expose
        private Object studMotherOccupation;
        @SerializedName("Stud_mother_off_name")
        @Expose
        private Object studMotherOffName;
        @SerializedName("Stud_mother_off_landline")
        @Expose
        private Object studMotherOffLandline;
        @SerializedName("Stud_mother_off_address1")
        @Expose
        private Object studMotherOffAddress1;
        @SerializedName("Stud_mother_off_address2")
        @Expose
        private Object studMotherOffAddress2;
        @SerializedName("Stud_mother_off_city")
        @Expose
        private Object studMotherOffCity;
        @SerializedName("Stud_Office_Address")
        @Expose
        private Object studOfficeAddress;
        @SerializedName("Stud_office_city")
        @Expose
        private Object studOfficeCity;
        @SerializedName("Stud_office_state")
        @Expose
        private Object studOfficeState;
        @SerializedName("Stud_office_country")
        @Expose
        private Object studOfficeCountry;
        @SerializedName("Stud_office_landline")
        @Expose
        private Object studOfficeLandline;
        @SerializedName("stud_office_nm")
        @Expose
        private Object studOfficeNm;
        @SerializedName("Stud_Office_Address1")
        @Expose
        private Object studOfficeAddress1;
        @SerializedName("Stud_sms")
        @Expose
        private Object studSms;
        @SerializedName("stud_mtr_sms")
        @Expose
        private Object studMtrSms;
        @SerializedName("stud_ftr_sms")
        @Expose
        private Object studFtrSms;
        @SerializedName("stud_transport")
        @Expose
        private Integer studTransport;
        @SerializedName("Stud_created_by")
        @Expose
        private Object studCreatedBy;
        @SerializedName("Stud_created_date")
        @Expose
        private String studCreatedDate;
        @SerializedName("stud_modify_by")
        @Expose
        private Integer studModifyBy;
        @SerializedName("Stud_modify_date")
        @Expose
        private String studModifyDate;
        @SerializedName("Stud_is_Status")
        @Expose
        private Integer studIsStatus;
        @SerializedName("Stud_is_delete")
        @Expose
        private Integer studIsDelete;
        @SerializedName("Stud_created_ip_address")
        @Expose
        private Object studCreatedIpAddress;
        @SerializedName("Stud_Modify_ip_address")
        @Expose
        private String studModifyIpAddress;
        @SerializedName("stud_guj_first_name")
        @Expose
        private Object studGujFirstName;
        @SerializedName("stud_guj_middle_name")
        @Expose
        private Object studGujMiddleName;
        @SerializedName("stud_guj_last_name")
        @Expose
        private Object studGujLastName;
        @SerializedName("stud_guj_mother_name")
        @Expose
        private Object studGujMotherName;
        @SerializedName("stud_guj_address")
        @Expose
        private Object studGujAddress;
        @SerializedName("stud_guj_birth_place")
        @Expose
        private Object studGujBirthPlace;
        @SerializedName("stud_guj_birth_date")
        @Expose
        private Object studGujBirthDate;
        @SerializedName("stud_guj_religion")
        @Expose
        private Object studGujReligion;
        @SerializedName("stud_guj_cast")
        @Expose
        private Object studGujCast;
        @SerializedName("stud_guj_last_school")
        @Expose
        private Object studGujLastSchool;
        @SerializedName("stud_guj_nationality")
        @Expose
        private Object studGujNationality;
        @SerializedName("stud_card_no")
        @Expose
        private Object studCardNo;
        @SerializedName("stud_card_status")
        @Expose
        private Object studCardStatus;
        @SerializedName("stud_image")
        @Expose
        private Object studImage;
        @SerializedName("stud_FCM_id")
        @Expose
        private String studFCMId;
        @SerializedName("stud_hobbies")
        @Expose
        private Object studHobbies;
        @SerializedName("stud_father_designation")
        @Expose
        private Object studFatherDesignation;
        @SerializedName("stud_total_backlog")
        @Expose
        private Object studTotalBacklog;
        @SerializedName("stud_photo_byte")
        @Expose
        private Object studPhotoByte;
        @SerializedName("stud_taluka")
        @Expose
        private Object studTaluka;
        @SerializedName("stud_district")
        @Expose
        private Object studDistrict;
        @SerializedName("stud_is_other_university")
        @Expose
        private Object studIsOtherUniversity;
        @SerializedName("stud_migration_Date")
        @Expose
        private Object studMigrationDate;
        @SerializedName("stud_migration_number")
        @Expose
        private Object studMigrationNumber;
        @SerializedName("stud_migrate_university_name")
        @Expose
        private Object studMigrateUniversityName;
        @SerializedName("stud_bank_account_number")
        @Expose
        private Object studBankAccountNumber;
        @SerializedName("stud_bank_name")
        @Expose
        private Object studBankName;
        @SerializedName("stud_bank_branch_code")
        @Expose
        private Object studBankBranchCode;
        @SerializedName("stud_bank_branch_city_name")
        @Expose
        private Object studBankBranchCityName;
        @SerializedName("stud_bank_IFSC_code")
        @Expose
        private Object studBankIFSCCode;
        @SerializedName("stud_10th_result")
        @Expose
        private Object stud10thResult;
        @SerializedName("stud_12th_result")
        @Expose
        private Object stud12thResult;
        @SerializedName("stud_house")
        @Expose
        private Object studHouse;
        @SerializedName("stud_family_annual_income")
        @Expose
        private Object studFamilyAnnualIncome;
        @SerializedName("stud_physically_handicap")
        @Expose
        private Object studPhysicallyHandicap;
        @SerializedName("stud_family_docname")
        @Expose
        private Object studFamilyDocname;
        @SerializedName("stud_doc_cont_no")
        @Expose
        private Object studDocContNo;
        @SerializedName("stud_father_photo")
        @Expose
        private Object studFatherPhoto;
        @SerializedName("stud_mother_photo")
        @Expose
        private Object studMotherPhoto;
        @SerializedName("stud_leaving_certi")
        @Expose
        private Object studLeavingCerti;
        @SerializedName("stud_medical_detail_proof")
        @Expose
        private Object studMedicalDetailProof;
        @SerializedName("stud_aadhar_card")
        @Expose
        private Object studAadharCard;
        @SerializedName("stud_hostel_id")
        @Expose
        private Integer studHostelId;
        @SerializedName("stud_internet_username")
        @Expose
        private Object studInternetUsername;
        @SerializedName("stud_internet_password")
        @Expose
        private Object studInternetPassword;
        @SerializedName("stud_internet_date")
        @Expose
        private Object studInternetDate;
        @SerializedName("stud_menu_group_id")
        @Expose
        private Integer studMenuGroupId;
        @SerializedName("stud_mother_toung")
        @Expose
        private Object studMotherToung;
        @SerializedName("stud_ph")
        @Expose
        private Object studPh;
        @SerializedName("stud_urban_rural")
        @Expose
        private Object studUrbanRural;
        @SerializedName("stud_name_marksheet")
        @Expose
        private Object studNameMarksheet;
        @SerializedName("stud_adm_form_no")
        @Expose
        private Object studAdmFormNo;
        @SerializedName("stud_parent_username")
        @Expose
        private Object studParentUsername;
        @SerializedName("stud_parent_password")
        @Expose
        private Object studParentPassword;
        @SerializedName("stud_Enrollments_date")
        @Expose
        private String studEnrollmentsDate;
        @SerializedName("Stud_PRN_no")
        @Expose
        private Object studPRNNo;
        @SerializedName("stud_personal_email")
        @Expose
        private Object studPersonalEmail;
        @SerializedName("stud_fee_category")
        @Expose
        private Object studFeeCategory;
        @SerializedName("stud_signature")
        @Expose
        private Object studSignature;
        @SerializedName("stud_profile_status")
        @Expose
        private Integer studProfileStatus;
        @SerializedName("stud_encrypt_password")
        @Expose
        private String studEncryptPassword;
        @SerializedName("stud_otp")
        @Expose
        private String studOtp;
        @SerializedName("stud_bank_beneficiary_name")
        @Expose
        private Object studBankBeneficiaryName;
        @SerializedName("stud_bank_branch_name")
        @Expose
        private Object studBankBranchName;
        @SerializedName("stud_bank_passbook")
        @Expose
        private Object studBankPassbook;
        @SerializedName("stud_bank_detail_is_lock")
        @Expose
        private Object studBankDetailIsLock;
        @SerializedName("stud_bank_detail_locked_by")
        @Expose
        private Object studBankDetailLockedBy;
        @SerializedName("stud_bank_detail_locked_date")
        @Expose
        private Object studBankDetailLockedDate;
        @SerializedName("stud_bank_detail_locked_ip")
        @Expose
        private Object studBankDetailLockedIp;
        @SerializedName("stud_is_login_deactive")
        @Expose
        private Object studIsLoginDeactive;
        @SerializedName("Stud_institute_emailid")
        @Expose
        private Object studInstituteEmailid;
        @SerializedName("Stud_institute_password")
        @Expose
        private Object studInstitutePassword;
        @SerializedName("Stud_institute_date")
        @Expose
        private Object studInstituteDate;
        @SerializedName("ac_id")
        @Expose
        private Integer acId;
        @SerializedName("ac_institute_id")
        @Expose
        private Integer acInstituteId;
        @SerializedName("ac_code")
        @Expose
        private String acCode;
        @SerializedName("ac_trust_name")
        @Expose
        private Object acTrustName;
        @SerializedName("ac_full_name")
        @Expose
        private String acFullName;
        @SerializedName("ac_short_name")
        @Expose
        private String acShortName;
        @SerializedName("ac_type_id")
        @Expose
        private Integer acTypeId;
        @SerializedName("ac_pricipal_id")
        @Expose
        private Integer acPricipalId;
        @SerializedName("ac_address")
        @Expose
        private String acAddress;
        @SerializedName("ac_dist_id")
        @Expose
        private Integer acDistId;
        @SerializedName("ac_tal_id")
        @Expose
        private Integer acTalId;
        @SerializedName("ac_city_id")
        @Expose
        private Integer acCityId;
        @SerializedName("ac_pin_no")
        @Expose
        private Integer acPinNo;
        @SerializedName("ac_phone_no")
        @Expose
        private String acPhoneNo;
        @SerializedName("ac_fax_no")
        @Expose
        private Object acFaxNo;
        @SerializedName("ac_mobile_no")
        @Expose
        private String acMobileNo;
        @SerializedName("ac_email_id")
        @Expose
        private String acEmailId;
        @SerializedName("ac_website")
        @Expose
        private String acWebsite;
        @SerializedName("ac_map")
        @Expose
        private String acMap;
        @SerializedName("ac_logo")
        @Expose
        private String acLogo;
        @SerializedName("ac_logo_img")
        @Expose
        private Object acLogoImg;
        @SerializedName("ac_principal_name")
        @Expose
        private String acPrincipalName;
        @SerializedName("ac_principal_phone_no")
        @Expose
        private String acPrincipalPhoneNo;
        @SerializedName("ac_principal_mobile_no")
        @Expose
        private String acPrincipalMobileNo;
        @SerializedName("ac_principal_photo")
        @Expose
        private String acPrincipalPhoto;
        @SerializedName("ac_principal_sign")
        @Expose
        private String acPrincipalSign;
        @SerializedName("ac_clerk_name")
        @Expose
        private String acClerkName;
        @SerializedName("ac_clerk_phone_no")
        @Expose
        private String acClerkPhoneNo;
        @SerializedName("ac_clerk_mobile_no")
        @Expose
        private String acClerkMobileNo;
        @SerializedName("ac_inquiry_contact_no")
        @Expose
        private String acInquiryContactNo;
        @SerializedName("ac_is_delete")
        @Expose
        private Integer acIsDelete;
        @SerializedName("ac_is_status")
        @Expose
        private Integer acIsStatus;
        @SerializedName("ac_created_by")
        @Expose
        private String acCreatedBy;
        @SerializedName("ac_created_date")
        @Expose
        private String acCreatedDate;
        @SerializedName("ac_created_ip")
        @Expose
        private String acCreatedIp;
        @SerializedName("ac_deleted_by")
        @Expose
        private Object acDeletedBy;
        @SerializedName("ac_deleted_date")
        @Expose
        private Object acDeletedDate;
        @SerializedName("ac_deleted_ip")
        @Expose
        private Object acDeletedIp;
        @SerializedName("ac_modify_by")
        @Expose
        private String acModifyBy;
        @SerializedName("ac_modify_date")
        @Expose
        private String acModifyDate;
        @SerializedName("ac_modify_ip")
        @Expose
        private String acModifyIp;
        @SerializedName("hdfc_scheme_code")
        @Expose
        private String hdfcSchemeCode;
        @SerializedName("hdfc_Merchant")
        @Expose
        private String hdfcMerchant;
        @SerializedName("hdfc_Key")
        @Expose
        private String hdfcKey;
        @SerializedName("hdfc_KeyIV")
        @Expose
        private String hdfcKeyIV;
        @SerializedName("hdfc_account_no")
        @Expose
        private Object hdfcAccountNo;
        @SerializedName("ac_elective")
        @Expose
        private Object acElective;
        @SerializedName("ac_specialization")
        @Expose
        private Object acSpecialization;
        @SerializedName("ac_value_added")
        @Expose
        private Object acValueAdded;
        @SerializedName("ac_theory")
        @Expose
        private Object acTheory;
        @SerializedName("ac_practical")
        @Expose
        private Object acPractical;
        @SerializedName("ac_tutorial")
        @Expose
        private Object acTutorial;
        @SerializedName("ac_only_girls")
        @Expose
        private Object acOnlyGirls;
        @SerializedName("ac_only_boys")
        @Expose
        private Object acOnlyBoys;
        @SerializedName("ac_both")
        @Expose
        private Object acBoth;
        @SerializedName("ac_group_id")
        @Expose
        private Integer acGroupId;
        @SerializedName("ac_homework")
        @Expose
        private Object acHomework;
        @SerializedName("ac_attendance_type")
        @Expose
        private Object acAttendanceType;
        @SerializedName("ac_tt_time_display")
        @Expose
        private Object acTtTimeDisplay;
        @SerializedName("ac_attendance_method")
        @Expose
        private Integer acAttendanceMethod;
        @SerializedName("ac_emp_name_squence_query")
        @Expose
        private Object acEmpNameSquenceQuery;
        @SerializedName("ac_stud_name_squence_query")
        @Expose
        private Object acStudNameSquenceQuery;
        @SerializedName("ac_emp_name_squence")
        @Expose
        private Object acEmpNameSquence;
        @SerializedName("ac_stud_name_squence")
        @Expose
        private Object acStudNameSquence;
        @SerializedName("Axis_Merchant")
        @Expose
        private String axisMerchant;
        @SerializedName("Axis_Secret_Key")
        @Expose
        private String axisSecretKey;
        @SerializedName("ac_master_page_name")
        @Expose
        private Object acMasterPageName;
        @SerializedName("ac_css_style_name")
        @Expose
        private Object acCssStyleName;
        @SerializedName("ac_paytm_url")
        @Expose
        private String acPaytmUrl;
        @SerializedName("ac_stud_att_display")
        @Expose
        private Integer acStudAttDisplay;
        @SerializedName("Axis_Access_Code")
        @Expose
        private Object axisAccessCode;
        @SerializedName("ac_payslip_college_name")
        @Expose
        private String acPayslipCollegeName;
        @SerializedName("ac_kind_of_leave")
        @Expose
        private Object acKindOfLeave;
        @SerializedName("ac_leave_type_name")
        @Expose
        private Object acLeaveTypeName;
        @SerializedName("ac_mid_supervisor_status")
        @Expose
        private Object acMidSupervisorStatus;
        @SerializedName("ac_day_wise_pr_slot")
        @Expose
        private Object acDayWisePrSlot;
        @SerializedName("ac_fill_attendance_lock")
        @Expose
        private Object acFillAttendanceLock;
        @SerializedName("ac_is_extra_lect_in_previous_date")
        @Expose
        private Object acIsExtraLectInPreviousDate;
        @SerializedName("ac_mid_multi_res_req")
        @Expose
        private Object acMidMultiResReq;
        @SerializedName("ac_is_live_class")
        @Expose
        private Object acIsLiveClass;
        @SerializedName("ac_acc_code")
        @Expose
        private String acAccCode;
        @SerializedName("ac_cms_code")
        @Expose
        private String acCmsCode;
        @SerializedName("ac_is_default")
        @Expose
        private Integer acIsDefault;
        @SerializedName("ac_pg_id")
        @Expose
        private Object acPgId;
        @SerializedName("ac_course_with_method")
        @Expose
        private Object acCourseWithMethod;
        @SerializedName("ac_att_teaching_topic")
        @Expose
        private Object acAttTeachingTopic;
        @SerializedName("ac_att_teaching_aid")
        @Expose
        private Object acAttTeachingAid;
        @SerializedName("ac_att_teaching_method")
        @Expose
        private Object acAttTeachingMethod;
        @SerializedName("ac_dept_with_method")
        @Expose
        private Object acDeptWithMethod;
        @SerializedName("ac_is_partial_fee")
        @Expose
        private Object acIsPartialFee;

        public Integer getStudId() {
            return studId;
        }

        public void setStudId(Integer studId) {
            this.studId = studId;
        }

        public Object getStudInquiryNo() {
            return studInquiryNo;
        }

        public void setStudInquiryNo(Object studInquiryNo) {
            this.studInquiryNo = studInquiryNo;
        }

        public Integer getStudAitsStudId() {
            return studAitsStudId;
        }

        public void setStudAitsStudId(Integer studAitsStudId) {
            this.studAitsStudId = studAitsStudId;
        }

        public String getStudEnrollmentNo() {
            return studEnrollmentNo;
        }

        public void setStudEnrollmentNo(String studEnrollmentNo) {
            this.studEnrollmentNo = studEnrollmentNo;
        }

        public String getStudAdmissionNo() {
            return studAdmissionNo;
        }

        public void setStudAdmissionNo(String studAdmissionNo) {
            this.studAdmissionNo = studAdmissionNo;
        }

        public Integer getStudMainSchoolId() {
            return studMainSchoolId;
        }

        public void setStudMainSchoolId(Integer studMainSchoolId) {
            this.studMainSchoolId = studMainSchoolId;
        }

        public Integer getStudAdmissionYear() {
            return studAdmissionYear;
        }

        public void setStudAdmissionYear(Integer studAdmissionYear) {
            this.studAdmissionYear = studAdmissionYear;
        }

        public Integer getStudYearId() {
            return studYearId;
        }

        public void setStudYearId(Integer studYearId) {
            this.studYearId = studYearId;
        }

        public Object getStudPrefix() {
            return studPrefix;
        }

        public void setStudPrefix(Object studPrefix) {
            this.studPrefix = studPrefix;
        }

        public String getStudFirstName() {
            return studFirstName;
        }

        public void setStudFirstName(String studFirstName) {
            this.studFirstName = studFirstName;
        }

        public String getStudMiddleName() {
            return studMiddleName;
        }

        public void setStudMiddleName(String studMiddleName) {
            this.studMiddleName = studMiddleName;
        }

        public Object getStudLastName() {
            return studLastName;
        }

        public void setStudLastName(Object studLastName) {
            this.studLastName = studLastName;
        }

        public String getStudJoinDate() {
            return studJoinDate;
        }

        public void setStudJoinDate(String studJoinDate) {
            this.studJoinDate = studJoinDate;
        }

        public Integer getStudGender() {
            return studGender;
        }

        public void setStudGender(Integer studGender) {
            this.studGender = studGender;
        }

        public Object getStudDateOfBirth() {
            return studDateOfBirth;
        }

        public void setStudDateOfBirth(Object studDateOfBirth) {
            this.studDateOfBirth = studDateOfBirth;
        }

        public String getStudBdate() {
            return studBdate;
        }

        public void setStudBdate(String studBdate) {
            this.studBdate = studBdate;
        }

        public Integer getStudBloodGroup() {
            return studBloodGroup;
        }

        public void setStudBloodGroup(Integer studBloodGroup) {
            this.studBloodGroup = studBloodGroup;
        }

        public Integer getStudCategory() {
            return studCategory;
        }

        public void setStudCategory(Integer studCategory) {
            this.studCategory = studCategory;
        }

        public String getStudAdharNo() {
            return studAdharNo;
        }

        public void setStudAdharNo(String studAdharNo) {
            this.studAdharNo = studAdharNo;
        }

        public Object getStudUidNo() {
            return studUidNo;
        }

        public void setStudUidNo(Object studUidNo) {
            this.studUidNo = studUidNo;
        }

        public Integer getStudAdmissionType() {
            return studAdmissionType;
        }

        public void setStudAdmissionType(Integer studAdmissionType) {
            this.studAdmissionType = studAdmissionType;
        }

        public Integer getStudFeeType() {
            return studFeeType;
        }

        public void setStudFeeType(Integer studFeeType) {
            this.studFeeType = studFeeType;
        }

        public Integer getStudQuata() {
            return studQuata;
        }

        public void setStudQuata(Integer studQuata) {
            this.studQuata = studQuata;
        }

        public Integer getStudShift() {
            return studShift;
        }

        public void setStudShift(Integer studShift) {
            this.studShift = studShift;
        }

        public Integer getStudCourseId() {
            return studCourseId;
        }

        public void setStudCourseId(Integer studCourseId) {
            this.studCourseId = studCourseId;
        }

        public Object getStudSemId() {
            return studSemId;
        }

        public void setStudSemId(Object studSemId) {
            this.studSemId = studSemId;
        }

        public Object getStudBirthPlace() {
            return studBirthPlace;
        }

        public void setStudBirthPlace(Object studBirthPlace) {
            this.studBirthPlace = studBirthPlace;
        }

        public Object getStudReligion() {
            return studReligion;
        }

        public void setStudReligion(Object studReligion) {
            this.studReligion = studReligion;
        }

        public Object getStudSchoolName() {
            return studSchoolName;
        }

        public void setStudSchoolName(Object studSchoolName) {
            this.studSchoolName = studSchoolName;
        }

        public Object getStudStandardId() {
            return studStandardId;
        }

        public void setStudStandardId(Object studStandardId) {
            this.studStandardId = studStandardId;
        }

        public Object getStudBoard() {
            return studBoard;
        }

        public void setStudBoard(Object studBoard) {
            this.studBoard = studBoard;
        }

        public Object getStudMedium() {
            return studMedium;
        }

        public void setStudMedium(Object studMedium) {
            this.studMedium = studMedium;
        }

        public Object getStudStream() {
            return studStream;
        }

        public void setStudStream(Object studStream) {
            this.studStream = studStream;
        }

        public Object getStudNationality() {
            return studNationality;
        }

        public void setStudNationality(Object studNationality) {
            this.studNationality = studNationality;
        }

        public Integer getStudCast() {
            return studCast;
        }

        public void setStudCast(Integer studCast) {
            this.studCast = studCast;
        }

        public Object getStudSubCast() {
            return studSubCast;
        }

        public void setStudSubCast(Object studSubCast) {
            this.studSubCast = studSubCast;
        }

        public Object getStudLastYearResult() {
            return studLastYearResult;
        }

        public void setStudLastYearResult(Object studLastYearResult) {
            this.studLastYearResult = studLastYearResult;
        }

        public String getStudPhoto() {
            return studPhoto;
        }

        public void setStudPhoto(String studPhoto) {
            this.studPhoto = studPhoto;
        }

        public Object getStudResult() {
            return studResult;
        }

        public void setStudResult(Object studResult) {
            this.studResult = studResult;
        }

        public String getStudUserName() {
            return studUserName;
        }

        public void setStudUserName(String studUserName) {
            this.studUserName = studUserName;
        }

        public Object getStudPassword() {
            return studPassword;
        }

        public void setStudPassword(Object studPassword) {
            this.studPassword = studPassword;
        }

        public String getStudAddress() {
            return studAddress;
        }

        public void setStudAddress(String studAddress) {
            this.studAddress = studAddress;
        }

        public Object getStudCurrentAddress() {
            return studCurrentAddress;
        }

        public void setStudCurrentAddress(Object studCurrentAddress) {
            this.studCurrentAddress = studCurrentAddress;
        }

        public Integer getStudCity() {
            return studCity;
        }

        public void setStudCity(Integer studCity) {
            this.studCity = studCity;
        }

        public String getStudPinNo() {
            return studPinNo;
        }

        public void setStudPinNo(String studPinNo) {
            this.studPinNo = studPinNo;
        }

        public Object getStudState() {
            return studState;
        }

        public void setStudState(Object studState) {
            this.studState = studState;
        }

        public Object getStudCountry() {
            return studCountry;
        }

        public void setStudCountry(Object studCountry) {
            this.studCountry = studCountry;
        }

        public Object getStudLandLineNo() {
            return studLandLineNo;
        }

        public void setStudLandLineNo(Object studLandLineNo) {
            this.studLandLineNo = studLandLineNo;
        }

        public String getStudMobileNo() {
            return studMobileNo;
        }

        public void setStudMobileNo(String studMobileNo) {
            this.studMobileNo = studMobileNo;
        }

        public String getStudEmail() {
            return studEmail;
        }

        public void setStudEmail(String studEmail) {
            this.studEmail = studEmail;
        }

        public Object getStudEmerNo() {
            return studEmerNo;
        }

        public void setStudEmerNo(Object studEmerNo) {
            this.studEmerNo = studEmerNo;
        }

        public Object getStudOtherPhone() {
            return studOtherPhone;
        }

        public void setStudOtherPhone(Object studOtherPhone) {
            this.studOtherPhone = studOtherPhone;
        }

        public Object getStudRightChield() {
            return studRightChield;
        }

        public void setStudRightChield(Object studRightChield) {
            this.studRightChield = studRightChield;
        }

        public String getStudFatherName() {
            return studFatherName;
        }

        public void setStudFatherName(String studFatherName) {
            this.studFatherName = studFatherName;
        }

        public String getStudFatherMobileNo() {
            return studFatherMobileNo;
        }

        public void setStudFatherMobileNo(String studFatherMobileNo) {
            this.studFatherMobileNo = studFatherMobileNo;
        }

        public Object getStudFatherEmail() {
            return studFatherEmail;
        }

        public void setStudFatherEmail(Object studFatherEmail) {
            this.studFatherEmail = studFatherEmail;
        }

        public Object getStudFatherEducation() {
            return studFatherEducation;
        }

        public void setStudFatherEducation(Object studFatherEducation) {
            this.studFatherEducation = studFatherEducation;
        }

        public Object getStudFatherOccupation() {
            return studFatherOccupation;
        }

        public void setStudFatherOccupation(Object studFatherOccupation) {
            this.studFatherOccupation = studFatherOccupation;
        }

        public Object getStudParentAnniversary() {
            return studParentAnniversary;
        }

        public void setStudParentAnniversary(Object studParentAnniversary) {
            this.studParentAnniversary = studParentAnniversary;
        }

        public Object getStudMotherName() {
            return studMotherName;
        }

        public void setStudMotherName(Object studMotherName) {
            this.studMotherName = studMotherName;
        }

        public Object getStudMotherMobileNo() {
            return studMotherMobileNo;
        }

        public void setStudMotherMobileNo(Object studMotherMobileNo) {
            this.studMotherMobileNo = studMotherMobileNo;
        }

        public Object getStudMotherEmail() {
            return studMotherEmail;
        }

        public void setStudMotherEmail(Object studMotherEmail) {
            this.studMotherEmail = studMotherEmail;
        }

        public Object getStudMotherEducation() {
            return studMotherEducation;
        }

        public void setStudMotherEducation(Object studMotherEducation) {
            this.studMotherEducation = studMotherEducation;
        }

        public Object getStudMotherOccupation() {
            return studMotherOccupation;
        }

        public void setStudMotherOccupation(Object studMotherOccupation) {
            this.studMotherOccupation = studMotherOccupation;
        }

        public Object getStudMotherOffName() {
            return studMotherOffName;
        }

        public void setStudMotherOffName(Object studMotherOffName) {
            this.studMotherOffName = studMotherOffName;
        }

        public Object getStudMotherOffLandline() {
            return studMotherOffLandline;
        }

        public void setStudMotherOffLandline(Object studMotherOffLandline) {
            this.studMotherOffLandline = studMotherOffLandline;
        }

        public Object getStudMotherOffAddress1() {
            return studMotherOffAddress1;
        }

        public void setStudMotherOffAddress1(Object studMotherOffAddress1) {
            this.studMotherOffAddress1 = studMotherOffAddress1;
        }

        public Object getStudMotherOffAddress2() {
            return studMotherOffAddress2;
        }

        public void setStudMotherOffAddress2(Object studMotherOffAddress2) {
            this.studMotherOffAddress2 = studMotherOffAddress2;
        }

        public Object getStudMotherOffCity() {
            return studMotherOffCity;
        }

        public void setStudMotherOffCity(Object studMotherOffCity) {
            this.studMotherOffCity = studMotherOffCity;
        }

        public Object getStudOfficeAddress() {
            return studOfficeAddress;
        }

        public void setStudOfficeAddress(Object studOfficeAddress) {
            this.studOfficeAddress = studOfficeAddress;
        }

        public Object getStudOfficeCity() {
            return studOfficeCity;
        }

        public void setStudOfficeCity(Object studOfficeCity) {
            this.studOfficeCity = studOfficeCity;
        }

        public Object getStudOfficeState() {
            return studOfficeState;
        }

        public void setStudOfficeState(Object studOfficeState) {
            this.studOfficeState = studOfficeState;
        }

        public Object getStudOfficeCountry() {
            return studOfficeCountry;
        }

        public void setStudOfficeCountry(Object studOfficeCountry) {
            this.studOfficeCountry = studOfficeCountry;
        }

        public Object getStudOfficeLandline() {
            return studOfficeLandline;
        }

        public void setStudOfficeLandline(Object studOfficeLandline) {
            this.studOfficeLandline = studOfficeLandline;
        }

        public Object getStudOfficeNm() {
            return studOfficeNm;
        }

        public void setStudOfficeNm(Object studOfficeNm) {
            this.studOfficeNm = studOfficeNm;
        }

        public Object getStudOfficeAddress1() {
            return studOfficeAddress1;
        }

        public void setStudOfficeAddress1(Object studOfficeAddress1) {
            this.studOfficeAddress1 = studOfficeAddress1;
        }

        public Object getStudSms() {
            return studSms;
        }

        public void setStudSms(Object studSms) {
            this.studSms = studSms;
        }

        public Object getStudMtrSms() {
            return studMtrSms;
        }

        public void setStudMtrSms(Object studMtrSms) {
            this.studMtrSms = studMtrSms;
        }

        public Object getStudFtrSms() {
            return studFtrSms;
        }

        public void setStudFtrSms(Object studFtrSms) {
            this.studFtrSms = studFtrSms;
        }

        public Integer getStudTransport() {
            return studTransport;
        }

        public void setStudTransport(Integer studTransport) {
            this.studTransport = studTransport;
        }

        public Object getStudCreatedBy() {
            return studCreatedBy;
        }

        public void setStudCreatedBy(Object studCreatedBy) {
            this.studCreatedBy = studCreatedBy;
        }

        public String getStudCreatedDate() {
            return studCreatedDate;
        }

        public void setStudCreatedDate(String studCreatedDate) {
            this.studCreatedDate = studCreatedDate;
        }

        public Integer getStudModifyBy() {
            return studModifyBy;
        }

        public void setStudModifyBy(Integer studModifyBy) {
            this.studModifyBy = studModifyBy;
        }

        public String getStudModifyDate() {
            return studModifyDate;
        }

        public void setStudModifyDate(String studModifyDate) {
            this.studModifyDate = studModifyDate;
        }

        public Integer getStudIsStatus() {
            return studIsStatus;
        }

        public void setStudIsStatus(Integer studIsStatus) {
            this.studIsStatus = studIsStatus;
        }

        public Integer getStudIsDelete() {
            return studIsDelete;
        }

        public void setStudIsDelete(Integer studIsDelete) {
            this.studIsDelete = studIsDelete;
        }

        public Object getStudCreatedIpAddress() {
            return studCreatedIpAddress;
        }

        public void setStudCreatedIpAddress(Object studCreatedIpAddress) {
            this.studCreatedIpAddress = studCreatedIpAddress;
        }

        public String getStudModifyIpAddress() {
            return studModifyIpAddress;
        }

        public void setStudModifyIpAddress(String studModifyIpAddress) {
            this.studModifyIpAddress = studModifyIpAddress;
        }

        public Object getStudGujFirstName() {
            return studGujFirstName;
        }

        public void setStudGujFirstName(Object studGujFirstName) {
            this.studGujFirstName = studGujFirstName;
        }

        public Object getStudGujMiddleName() {
            return studGujMiddleName;
        }

        public void setStudGujMiddleName(Object studGujMiddleName) {
            this.studGujMiddleName = studGujMiddleName;
        }

        public Object getStudGujLastName() {
            return studGujLastName;
        }

        public void setStudGujLastName(Object studGujLastName) {
            this.studGujLastName = studGujLastName;
        }

        public Object getStudGujMotherName() {
            return studGujMotherName;
        }

        public void setStudGujMotherName(Object studGujMotherName) {
            this.studGujMotherName = studGujMotherName;
        }

        public Object getStudGujAddress() {
            return studGujAddress;
        }

        public void setStudGujAddress(Object studGujAddress) {
            this.studGujAddress = studGujAddress;
        }

        public Object getStudGujBirthPlace() {
            return studGujBirthPlace;
        }

        public void setStudGujBirthPlace(Object studGujBirthPlace) {
            this.studGujBirthPlace = studGujBirthPlace;
        }

        public Object getStudGujBirthDate() {
            return studGujBirthDate;
        }

        public void setStudGujBirthDate(Object studGujBirthDate) {
            this.studGujBirthDate = studGujBirthDate;
        }

        public Object getStudGujReligion() {
            return studGujReligion;
        }

        public void setStudGujReligion(Object studGujReligion) {
            this.studGujReligion = studGujReligion;
        }

        public Object getStudGujCast() {
            return studGujCast;
        }

        public void setStudGujCast(Object studGujCast) {
            this.studGujCast = studGujCast;
        }

        public Object getStudGujLastSchool() {
            return studGujLastSchool;
        }

        public void setStudGujLastSchool(Object studGujLastSchool) {
            this.studGujLastSchool = studGujLastSchool;
        }

        public Object getStudGujNationality() {
            return studGujNationality;
        }

        public void setStudGujNationality(Object studGujNationality) {
            this.studGujNationality = studGujNationality;
        }

        public Object getStudCardNo() {
            return studCardNo;
        }

        public void setStudCardNo(Object studCardNo) {
            this.studCardNo = studCardNo;
        }

        public Object getStudCardStatus() {
            return studCardStatus;
        }

        public void setStudCardStatus(Object studCardStatus) {
            this.studCardStatus = studCardStatus;
        }

        public Object getStudImage() {
            return studImage;
        }

        public void setStudImage(Object studImage) {
            this.studImage = studImage;
        }

        public String getStudFCMId() {
            return studFCMId;
        }

        public void setStudFCMId(String studFCMId) {
            this.studFCMId = studFCMId;
        }

        public Object getStudHobbies() {
            return studHobbies;
        }

        public void setStudHobbies(Object studHobbies) {
            this.studHobbies = studHobbies;
        }

        public Object getStudFatherDesignation() {
            return studFatherDesignation;
        }

        public void setStudFatherDesignation(Object studFatherDesignation) {
            this.studFatherDesignation = studFatherDesignation;
        }

        public Object getStudTotalBacklog() {
            return studTotalBacklog;
        }

        public void setStudTotalBacklog(Object studTotalBacklog) {
            this.studTotalBacklog = studTotalBacklog;
        }

        public Object getStudPhotoByte() {
            return studPhotoByte;
        }

        public void setStudPhotoByte(Object studPhotoByte) {
            this.studPhotoByte = studPhotoByte;
        }

        public Object getStudTaluka() {
            return studTaluka;
        }

        public void setStudTaluka(Object studTaluka) {
            this.studTaluka = studTaluka;
        }

        public Object getStudDistrict() {
            return studDistrict;
        }

        public void setStudDistrict(Object studDistrict) {
            this.studDistrict = studDistrict;
        }

        public Object getStudIsOtherUniversity() {
            return studIsOtherUniversity;
        }

        public void setStudIsOtherUniversity(Object studIsOtherUniversity) {
            this.studIsOtherUniversity = studIsOtherUniversity;
        }

        public Object getStudMigrationDate() {
            return studMigrationDate;
        }

        public void setStudMigrationDate(Object studMigrationDate) {
            this.studMigrationDate = studMigrationDate;
        }

        public Object getStudMigrationNumber() {
            return studMigrationNumber;
        }

        public void setStudMigrationNumber(Object studMigrationNumber) {
            this.studMigrationNumber = studMigrationNumber;
        }

        public Object getStudMigrateUniversityName() {
            return studMigrateUniversityName;
        }

        public void setStudMigrateUniversityName(Object studMigrateUniversityName) {
            this.studMigrateUniversityName = studMigrateUniversityName;
        }

        public Object getStudBankAccountNumber() {
            return studBankAccountNumber;
        }

        public void setStudBankAccountNumber(Object studBankAccountNumber) {
            this.studBankAccountNumber = studBankAccountNumber;
        }

        public Object getStudBankName() {
            return studBankName;
        }

        public void setStudBankName(Object studBankName) {
            this.studBankName = studBankName;
        }

        public Object getStudBankBranchCode() {
            return studBankBranchCode;
        }

        public void setStudBankBranchCode(Object studBankBranchCode) {
            this.studBankBranchCode = studBankBranchCode;
        }

        public Object getStudBankBranchCityName() {
            return studBankBranchCityName;
        }

        public void setStudBankBranchCityName(Object studBankBranchCityName) {
            this.studBankBranchCityName = studBankBranchCityName;
        }

        public Object getStudBankIFSCCode() {
            return studBankIFSCCode;
        }

        public void setStudBankIFSCCode(Object studBankIFSCCode) {
            this.studBankIFSCCode = studBankIFSCCode;
        }

        public Object getStud10thResult() {
            return stud10thResult;
        }

        public void setStud10thResult(Object stud10thResult) {
            this.stud10thResult = stud10thResult;
        }

        public Object getStud12thResult() {
            return stud12thResult;
        }

        public void setStud12thResult(Object stud12thResult) {
            this.stud12thResult = stud12thResult;
        }

        public Object getStudHouse() {
            return studHouse;
        }

        public void setStudHouse(Object studHouse) {
            this.studHouse = studHouse;
        }

        public Object getStudFamilyAnnualIncome() {
            return studFamilyAnnualIncome;
        }

        public void setStudFamilyAnnualIncome(Object studFamilyAnnualIncome) {
            this.studFamilyAnnualIncome = studFamilyAnnualIncome;
        }

        public Object getStudPhysicallyHandicap() {
            return studPhysicallyHandicap;
        }

        public void setStudPhysicallyHandicap(Object studPhysicallyHandicap) {
            this.studPhysicallyHandicap = studPhysicallyHandicap;
        }

        public Object getStudFamilyDocname() {
            return studFamilyDocname;
        }

        public void setStudFamilyDocname(Object studFamilyDocname) {
            this.studFamilyDocname = studFamilyDocname;
        }

        public Object getStudDocContNo() {
            return studDocContNo;
        }

        public void setStudDocContNo(Object studDocContNo) {
            this.studDocContNo = studDocContNo;
        }

        public Object getStudFatherPhoto() {
            return studFatherPhoto;
        }

        public void setStudFatherPhoto(Object studFatherPhoto) {
            this.studFatherPhoto = studFatherPhoto;
        }

        public Object getStudMotherPhoto() {
            return studMotherPhoto;
        }

        public void setStudMotherPhoto(Object studMotherPhoto) {
            this.studMotherPhoto = studMotherPhoto;
        }

        public Object getStudLeavingCerti() {
            return studLeavingCerti;
        }

        public void setStudLeavingCerti(Object studLeavingCerti) {
            this.studLeavingCerti = studLeavingCerti;
        }

        public Object getStudMedicalDetailProof() {
            return studMedicalDetailProof;
        }

        public void setStudMedicalDetailProof(Object studMedicalDetailProof) {
            this.studMedicalDetailProof = studMedicalDetailProof;
        }

        public Object getStudAadharCard() {
            return studAadharCard;
        }

        public void setStudAadharCard(Object studAadharCard) {
            this.studAadharCard = studAadharCard;
        }

        public Integer getStudHostelId() {
            return studHostelId;
        }

        public void setStudHostelId(Integer studHostelId) {
            this.studHostelId = studHostelId;
        }

        public Object getStudInternetUsername() {
            return studInternetUsername;
        }

        public void setStudInternetUsername(Object studInternetUsername) {
            this.studInternetUsername = studInternetUsername;
        }

        public Object getStudInternetPassword() {
            return studInternetPassword;
        }

        public void setStudInternetPassword(Object studInternetPassword) {
            this.studInternetPassword = studInternetPassword;
        }

        public Object getStudInternetDate() {
            return studInternetDate;
        }

        public void setStudInternetDate(Object studInternetDate) {
            this.studInternetDate = studInternetDate;
        }

        public Integer getStudMenuGroupId() {
            return studMenuGroupId;
        }

        public void setStudMenuGroupId(Integer studMenuGroupId) {
            this.studMenuGroupId = studMenuGroupId;
        }

        public Object getStudMotherToung() {
            return studMotherToung;
        }

        public void setStudMotherToung(Object studMotherToung) {
            this.studMotherToung = studMotherToung;
        }

        public Object getStudPh() {
            return studPh;
        }

        public void setStudPh(Object studPh) {
            this.studPh = studPh;
        }

        public Object getStudUrbanRural() {
            return studUrbanRural;
        }

        public void setStudUrbanRural(Object studUrbanRural) {
            this.studUrbanRural = studUrbanRural;
        }

        public Object getStudNameMarksheet() {
            return studNameMarksheet;
        }

        public void setStudNameMarksheet(Object studNameMarksheet) {
            this.studNameMarksheet = studNameMarksheet;
        }

        public Object getStudAdmFormNo() {
            return studAdmFormNo;
        }

        public void setStudAdmFormNo(Object studAdmFormNo) {
            this.studAdmFormNo = studAdmFormNo;
        }

        public Object getStudParentUsername() {
            return studParentUsername;
        }

        public void setStudParentUsername(Object studParentUsername) {
            this.studParentUsername = studParentUsername;
        }

        public Object getStudParentPassword() {
            return studParentPassword;
        }

        public void setStudParentPassword(Object studParentPassword) {
            this.studParentPassword = studParentPassword;
        }

        public String getStudEnrollmentsDate() {
            return studEnrollmentsDate;
        }

        public void setStudEnrollmentsDate(String studEnrollmentsDate) {
            this.studEnrollmentsDate = studEnrollmentsDate;
        }

        public Object getStudPRNNo() {
            return studPRNNo;
        }

        public void setStudPRNNo(Object studPRNNo) {
            this.studPRNNo = studPRNNo;
        }

        public Object getStudPersonalEmail() {
            return studPersonalEmail;
        }

        public void setStudPersonalEmail(Object studPersonalEmail) {
            this.studPersonalEmail = studPersonalEmail;
        }

        public Object getStudFeeCategory() {
            return studFeeCategory;
        }

        public void setStudFeeCategory(Object studFeeCategory) {
            this.studFeeCategory = studFeeCategory;
        }

        public Object getStudSignature() {
            return studSignature;
        }

        public void setStudSignature(Object studSignature) {
            this.studSignature = studSignature;
        }

        public Integer getStudProfileStatus() {
            return studProfileStatus;
        }

        public void setStudProfileStatus(Integer studProfileStatus) {
            this.studProfileStatus = studProfileStatus;
        }

        public String getStudEncryptPassword() {
            return studEncryptPassword;
        }

        public void setStudEncryptPassword(String studEncryptPassword) {
            this.studEncryptPassword = studEncryptPassword;
        }

        public String getStudOtp() {
            return studOtp;
        }

        public void setStudOtp(String studOtp) {
            this.studOtp = studOtp;
        }

        public Object getStudBankBeneficiaryName() {
            return studBankBeneficiaryName;
        }

        public void setStudBankBeneficiaryName(Object studBankBeneficiaryName) {
            this.studBankBeneficiaryName = studBankBeneficiaryName;
        }

        public Object getStudBankBranchName() {
            return studBankBranchName;
        }

        public void setStudBankBranchName(Object studBankBranchName) {
            this.studBankBranchName = studBankBranchName;
        }

        public Object getStudBankPassbook() {
            return studBankPassbook;
        }

        public void setStudBankPassbook(Object studBankPassbook) {
            this.studBankPassbook = studBankPassbook;
        }

        public Object getStudBankDetailIsLock() {
            return studBankDetailIsLock;
        }

        public void setStudBankDetailIsLock(Object studBankDetailIsLock) {
            this.studBankDetailIsLock = studBankDetailIsLock;
        }

        public Object getStudBankDetailLockedBy() {
            return studBankDetailLockedBy;
        }

        public void setStudBankDetailLockedBy(Object studBankDetailLockedBy) {
            this.studBankDetailLockedBy = studBankDetailLockedBy;
        }

        public Object getStudBankDetailLockedDate() {
            return studBankDetailLockedDate;
        }

        public void setStudBankDetailLockedDate(Object studBankDetailLockedDate) {
            this.studBankDetailLockedDate = studBankDetailLockedDate;
        }

        public Object getStudBankDetailLockedIp() {
            return studBankDetailLockedIp;
        }

        public void setStudBankDetailLockedIp(Object studBankDetailLockedIp) {
            this.studBankDetailLockedIp = studBankDetailLockedIp;
        }

        public Object getStudIsLoginDeactive() {
            return studIsLoginDeactive;
        }

        public void setStudIsLoginDeactive(Object studIsLoginDeactive) {
            this.studIsLoginDeactive = studIsLoginDeactive;
        }

        public Object getStudInstituteEmailid() {
            return studInstituteEmailid;
        }

        public void setStudInstituteEmailid(Object studInstituteEmailid) {
            this.studInstituteEmailid = studInstituteEmailid;
        }

        public Object getStudInstitutePassword() {
            return studInstitutePassword;
        }

        public void setStudInstitutePassword(Object studInstitutePassword) {
            this.studInstitutePassword = studInstitutePassword;
        }

        public Object getStudInstituteDate() {
            return studInstituteDate;
        }

        public void setStudInstituteDate(Object studInstituteDate) {
            this.studInstituteDate = studInstituteDate;
        }

        public Integer getAcId() {
            return acId;
        }

        public void setAcId(Integer acId) {
            this.acId = acId;
        }

        public Integer getAcInstituteId() {
            return acInstituteId;
        }

        public void setAcInstituteId(Integer acInstituteId) {
            this.acInstituteId = acInstituteId;
        }

        public String getAcCode() {
            return acCode;
        }

        public void setAcCode(String acCode) {
            this.acCode = acCode;
        }

        public Object getAcTrustName() {
            return acTrustName;
        }

        public void setAcTrustName(Object acTrustName) {
            this.acTrustName = acTrustName;
        }

        public String getAcFullName() {
            return acFullName;
        }

        public void setAcFullName(String acFullName) {
            this.acFullName = acFullName;
        }

        public String getAcShortName() {
            return acShortName;
        }

        public void setAcShortName(String acShortName) {
            this.acShortName = acShortName;
        }

        public Integer getAcTypeId() {
            return acTypeId;
        }

        public void setAcTypeId(Integer acTypeId) {
            this.acTypeId = acTypeId;
        }

        public Integer getAcPricipalId() {
            return acPricipalId;
        }

        public void setAcPricipalId(Integer acPricipalId) {
            this.acPricipalId = acPricipalId;
        }

        public String getAcAddress() {
            return acAddress;
        }

        public void setAcAddress(String acAddress) {
            this.acAddress = acAddress;
        }

        public Integer getAcDistId() {
            return acDistId;
        }

        public void setAcDistId(Integer acDistId) {
            this.acDistId = acDistId;
        }

        public Integer getAcTalId() {
            return acTalId;
        }

        public void setAcTalId(Integer acTalId) {
            this.acTalId = acTalId;
        }

        public Integer getAcCityId() {
            return acCityId;
        }

        public void setAcCityId(Integer acCityId) {
            this.acCityId = acCityId;
        }

        public Integer getAcPinNo() {
            return acPinNo;
        }

        public void setAcPinNo(Integer acPinNo) {
            this.acPinNo = acPinNo;
        }

        public String getAcPhoneNo() {
            return acPhoneNo;
        }

        public void setAcPhoneNo(String acPhoneNo) {
            this.acPhoneNo = acPhoneNo;
        }

        public Object getAcFaxNo() {
            return acFaxNo;
        }

        public void setAcFaxNo(Object acFaxNo) {
            this.acFaxNo = acFaxNo;
        }

        public String getAcMobileNo() {
            return acMobileNo;
        }

        public void setAcMobileNo(String acMobileNo) {
            this.acMobileNo = acMobileNo;
        }

        public String getAcEmailId() {
            return acEmailId;
        }

        public void setAcEmailId(String acEmailId) {
            this.acEmailId = acEmailId;
        }

        public String getAcWebsite() {
            return acWebsite;
        }

        public void setAcWebsite(String acWebsite) {
            this.acWebsite = acWebsite;
        }

        public String getAcMap() {
            return acMap;
        }

        public void setAcMap(String acMap) {
            this.acMap = acMap;
        }

        public String getAcLogo() {
            return acLogo;
        }

        public void setAcLogo(String acLogo) {
            this.acLogo = acLogo;
        }

        public Object getAcLogoImg() {
            return acLogoImg;
        }

        public void setAcLogoImg(Object acLogoImg) {
            this.acLogoImg = acLogoImg;
        }

        public String getAcPrincipalName() {
            return acPrincipalName;
        }

        public void setAcPrincipalName(String acPrincipalName) {
            this.acPrincipalName = acPrincipalName;
        }

        public String getAcPrincipalPhoneNo() {
            return acPrincipalPhoneNo;
        }

        public void setAcPrincipalPhoneNo(String acPrincipalPhoneNo) {
            this.acPrincipalPhoneNo = acPrincipalPhoneNo;
        }

        public String getAcPrincipalMobileNo() {
            return acPrincipalMobileNo;
        }

        public void setAcPrincipalMobileNo(String acPrincipalMobileNo) {
            this.acPrincipalMobileNo = acPrincipalMobileNo;
        }

        public String getAcPrincipalPhoto() {
            return acPrincipalPhoto;
        }

        public void setAcPrincipalPhoto(String acPrincipalPhoto) {
            this.acPrincipalPhoto = acPrincipalPhoto;
        }

        public String getAcPrincipalSign() {
            return acPrincipalSign;
        }

        public void setAcPrincipalSign(String acPrincipalSign) {
            this.acPrincipalSign = acPrincipalSign;
        }

        public String getAcClerkName() {
            return acClerkName;
        }

        public void setAcClerkName(String acClerkName) {
            this.acClerkName = acClerkName;
        }

        public String getAcClerkPhoneNo() {
            return acClerkPhoneNo;
        }

        public void setAcClerkPhoneNo(String acClerkPhoneNo) {
            this.acClerkPhoneNo = acClerkPhoneNo;
        }

        public String getAcClerkMobileNo() {
            return acClerkMobileNo;
        }

        public void setAcClerkMobileNo(String acClerkMobileNo) {
            this.acClerkMobileNo = acClerkMobileNo;
        }

        public String getAcInquiryContactNo() {
            return acInquiryContactNo;
        }

        public void setAcInquiryContactNo(String acInquiryContactNo) {
            this.acInquiryContactNo = acInquiryContactNo;
        }

        public Integer getAcIsDelete() {
            return acIsDelete;
        }

        public void setAcIsDelete(Integer acIsDelete) {
            this.acIsDelete = acIsDelete;
        }

        public Integer getAcIsStatus() {
            return acIsStatus;
        }

        public void setAcIsStatus(Integer acIsStatus) {
            this.acIsStatus = acIsStatus;
        }

        public String getAcCreatedBy() {
            return acCreatedBy;
        }

        public void setAcCreatedBy(String acCreatedBy) {
            this.acCreatedBy = acCreatedBy;
        }

        public String getAcCreatedDate() {
            return acCreatedDate;
        }

        public void setAcCreatedDate(String acCreatedDate) {
            this.acCreatedDate = acCreatedDate;
        }

        public String getAcCreatedIp() {
            return acCreatedIp;
        }

        public void setAcCreatedIp(String acCreatedIp) {
            this.acCreatedIp = acCreatedIp;
        }

        public Object getAcDeletedBy() {
            return acDeletedBy;
        }

        public void setAcDeletedBy(Object acDeletedBy) {
            this.acDeletedBy = acDeletedBy;
        }

        public Object getAcDeletedDate() {
            return acDeletedDate;
        }

        public void setAcDeletedDate(Object acDeletedDate) {
            this.acDeletedDate = acDeletedDate;
        }

        public Object getAcDeletedIp() {
            return acDeletedIp;
        }

        public void setAcDeletedIp(Object acDeletedIp) {
            this.acDeletedIp = acDeletedIp;
        }

        public String getAcModifyBy() {
            return acModifyBy;
        }

        public void setAcModifyBy(String acModifyBy) {
            this.acModifyBy = acModifyBy;
        }

        public String getAcModifyDate() {
            return acModifyDate;
        }

        public void setAcModifyDate(String acModifyDate) {
            this.acModifyDate = acModifyDate;
        }

        public String getAcModifyIp() {
            return acModifyIp;
        }

        public void setAcModifyIp(String acModifyIp) {
            this.acModifyIp = acModifyIp;
        }

        public String getHdfcSchemeCode() {
            return hdfcSchemeCode;
        }

        public void setHdfcSchemeCode(String hdfcSchemeCode) {
            this.hdfcSchemeCode = hdfcSchemeCode;
        }

        public String getHdfcMerchant() {
            return hdfcMerchant;
        }

        public void setHdfcMerchant(String hdfcMerchant) {
            this.hdfcMerchant = hdfcMerchant;
        }

        public String getHdfcKey() {
            return hdfcKey;
        }

        public void setHdfcKey(String hdfcKey) {
            this.hdfcKey = hdfcKey;
        }

        public String getHdfcKeyIV() {
            return hdfcKeyIV;
        }

        public void setHdfcKeyIV(String hdfcKeyIV) {
            this.hdfcKeyIV = hdfcKeyIV;
        }

        public Object getHdfcAccountNo() {
            return hdfcAccountNo;
        }

        public void setHdfcAccountNo(Object hdfcAccountNo) {
            this.hdfcAccountNo = hdfcAccountNo;
        }

        public Object getAcElective() {
            return acElective;
        }

        public void setAcElective(Object acElective) {
            this.acElective = acElective;
        }

        public Object getAcSpecialization() {
            return acSpecialization;
        }

        public void setAcSpecialization(Object acSpecialization) {
            this.acSpecialization = acSpecialization;
        }

        public Object getAcValueAdded() {
            return acValueAdded;
        }

        public void setAcValueAdded(Object acValueAdded) {
            this.acValueAdded = acValueAdded;
        }

        public Object getAcTheory() {
            return acTheory;
        }

        public void setAcTheory(Object acTheory) {
            this.acTheory = acTheory;
        }

        public Object getAcPractical() {
            return acPractical;
        }

        public void setAcPractical(Object acPractical) {
            this.acPractical = acPractical;
        }

        public Object getAcTutorial() {
            return acTutorial;
        }

        public void setAcTutorial(Object acTutorial) {
            this.acTutorial = acTutorial;
        }

        public Object getAcOnlyGirls() {
            return acOnlyGirls;
        }

        public void setAcOnlyGirls(Object acOnlyGirls) {
            this.acOnlyGirls = acOnlyGirls;
        }

        public Object getAcOnlyBoys() {
            return acOnlyBoys;
        }

        public void setAcOnlyBoys(Object acOnlyBoys) {
            this.acOnlyBoys = acOnlyBoys;
        }

        public Object getAcBoth() {
            return acBoth;
        }

        public void setAcBoth(Object acBoth) {
            this.acBoth = acBoth;
        }

        public Integer getAcGroupId() {
            return acGroupId;
        }

        public void setAcGroupId(Integer acGroupId) {
            this.acGroupId = acGroupId;
        }

        public Object getAcHomework() {
            return acHomework;
        }

        public void setAcHomework(Object acHomework) {
            this.acHomework = acHomework;
        }

        public Object getAcAttendanceType() {
            return acAttendanceType;
        }

        public void setAcAttendanceType(Object acAttendanceType) {
            this.acAttendanceType = acAttendanceType;
        }

        public Object getAcTtTimeDisplay() {
            return acTtTimeDisplay;
        }

        public void setAcTtTimeDisplay(Object acTtTimeDisplay) {
            this.acTtTimeDisplay = acTtTimeDisplay;
        }

        public Integer getAcAttendanceMethod() {
            return acAttendanceMethod;
        }

        public void setAcAttendanceMethod(Integer acAttendanceMethod) {
            this.acAttendanceMethod = acAttendanceMethod;
        }

        public Object getAcEmpNameSquenceQuery() {
            return acEmpNameSquenceQuery;
        }

        public void setAcEmpNameSquenceQuery(Object acEmpNameSquenceQuery) {
            this.acEmpNameSquenceQuery = acEmpNameSquenceQuery;
        }

        public Object getAcStudNameSquenceQuery() {
            return acStudNameSquenceQuery;
        }

        public void setAcStudNameSquenceQuery(Object acStudNameSquenceQuery) {
            this.acStudNameSquenceQuery = acStudNameSquenceQuery;
        }

        public Object getAcEmpNameSquence() {
            return acEmpNameSquence;
        }

        public void setAcEmpNameSquence(Object acEmpNameSquence) {
            this.acEmpNameSquence = acEmpNameSquence;
        }

        public Object getAcStudNameSquence() {
            return acStudNameSquence;
        }

        public void setAcStudNameSquence(Object acStudNameSquence) {
            this.acStudNameSquence = acStudNameSquence;
        }

        public String getAxisMerchant() {
            return axisMerchant;
        }

        public void setAxisMerchant(String axisMerchant) {
            this.axisMerchant = axisMerchant;
        }

        public String getAxisSecretKey() {
            return axisSecretKey;
        }

        public void setAxisSecretKey(String axisSecretKey) {
            this.axisSecretKey = axisSecretKey;
        }

        public Object getAcMasterPageName() {
            return acMasterPageName;
        }

        public void setAcMasterPageName(Object acMasterPageName) {
            this.acMasterPageName = acMasterPageName;
        }

        public Object getAcCssStyleName() {
            return acCssStyleName;
        }

        public void setAcCssStyleName(Object acCssStyleName) {
            this.acCssStyleName = acCssStyleName;
        }

        public String getAcPaytmUrl() {
            return acPaytmUrl;
        }

        public void setAcPaytmUrl(String acPaytmUrl) {
            this.acPaytmUrl = acPaytmUrl;
        }

        public Integer getAcStudAttDisplay() {
            return acStudAttDisplay;
        }

        public void setAcStudAttDisplay(Integer acStudAttDisplay) {
            this.acStudAttDisplay = acStudAttDisplay;
        }

        public Object getAxisAccessCode() {
            return axisAccessCode;
        }

        public void setAxisAccessCode(Object axisAccessCode) {
            this.axisAccessCode = axisAccessCode;
        }

        public String getAcPayslipCollegeName() {
            return acPayslipCollegeName;
        }

        public void setAcPayslipCollegeName(String acPayslipCollegeName) {
            this.acPayslipCollegeName = acPayslipCollegeName;
        }

        public Object getAcKindOfLeave() {
            return acKindOfLeave;
        }

        public void setAcKindOfLeave(Object acKindOfLeave) {
            this.acKindOfLeave = acKindOfLeave;
        }

        public Object getAcLeaveTypeName() {
            return acLeaveTypeName;
        }

        public void setAcLeaveTypeName(Object acLeaveTypeName) {
            this.acLeaveTypeName = acLeaveTypeName;
        }

        public Object getAcMidSupervisorStatus() {
            return acMidSupervisorStatus;
        }

        public void setAcMidSupervisorStatus(Object acMidSupervisorStatus) {
            this.acMidSupervisorStatus = acMidSupervisorStatus;
        }

        public Object getAcDayWisePrSlot() {
            return acDayWisePrSlot;
        }

        public void setAcDayWisePrSlot(Object acDayWisePrSlot) {
            this.acDayWisePrSlot = acDayWisePrSlot;
        }

        public Object getAcFillAttendanceLock() {
            return acFillAttendanceLock;
        }

        public void setAcFillAttendanceLock(Object acFillAttendanceLock) {
            this.acFillAttendanceLock = acFillAttendanceLock;
        }

        public Object getAcIsExtraLectInPreviousDate() {
            return acIsExtraLectInPreviousDate;
        }

        public void setAcIsExtraLectInPreviousDate(Object acIsExtraLectInPreviousDate) {
            this.acIsExtraLectInPreviousDate = acIsExtraLectInPreviousDate;
        }

        public Object getAcMidMultiResReq() {
            return acMidMultiResReq;
        }

        public void setAcMidMultiResReq(Object acMidMultiResReq) {
            this.acMidMultiResReq = acMidMultiResReq;
        }

        public Object getAcIsLiveClass() {
            return acIsLiveClass;
        }

        public void setAcIsLiveClass(Object acIsLiveClass) {
            this.acIsLiveClass = acIsLiveClass;
        }

        public String getAcAccCode() {
            return acAccCode;
        }

        public void setAcAccCode(String acAccCode) {
            this.acAccCode = acAccCode;
        }

        public String getAcCmsCode() {
            return acCmsCode;
        }

        public void setAcCmsCode(String acCmsCode) {
            this.acCmsCode = acCmsCode;
        }

        public Integer getAcIsDefault() {
            return acIsDefault;
        }

        public void setAcIsDefault(Integer acIsDefault) {
            this.acIsDefault = acIsDefault;
        }

        public Object getAcPgId() {
            return acPgId;
        }

        public void setAcPgId(Object acPgId) {
            this.acPgId = acPgId;
        }

        public Object getAcCourseWithMethod() {
            return acCourseWithMethod;
        }

        public void setAcCourseWithMethod(Object acCourseWithMethod) {
            this.acCourseWithMethod = acCourseWithMethod;
        }

        public Object getAcAttTeachingTopic() {
            return acAttTeachingTopic;
        }

        public void setAcAttTeachingTopic(Object acAttTeachingTopic) {
            this.acAttTeachingTopic = acAttTeachingTopic;
        }

        public Object getAcAttTeachingAid() {
            return acAttTeachingAid;
        }

        public void setAcAttTeachingAid(Object acAttTeachingAid) {
            this.acAttTeachingAid = acAttTeachingAid;
        }

        public Object getAcAttTeachingMethod() {
            return acAttTeachingMethod;
        }

        public void setAcAttTeachingMethod(Object acAttTeachingMethod) {
            this.acAttTeachingMethod = acAttTeachingMethod;
        }

        public Object getAcDeptWithMethod() {
            return acDeptWithMethod;
        }

        public void setAcDeptWithMethod(Object acDeptWithMethod) {
            this.acDeptWithMethod = acDeptWithMethod;
        }

        public Object getAcIsPartialFee() {
            return acIsPartialFee;
        }

        public void setAcIsPartialFee(Object acIsPartialFee) {
            this.acIsPartialFee = acIsPartialFee;
        }
    }
}
