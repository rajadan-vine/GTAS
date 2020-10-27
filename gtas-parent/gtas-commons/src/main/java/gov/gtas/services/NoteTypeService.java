package gov.gtas.services;

import static gov.gtas.constant.GtasSecurityConstants.PRIVILEGES_ADMIN_AND_VIEW_PASSENGER;
import static gov.gtas.constant.GtasSecurityConstants.PRIVILEGE_ADMIN;

import java.util.List;
import java.util.Set;

import gov.gtas.json.JsonServiceResponse;
import gov.gtas.model.NoteType;
import org.springframework.security.access.prepost.PreAuthorize;

import gov.gtas.vo.NoteTypeVo;

public interface NoteTypeService {

	@PreAuthorize(PRIVILEGES_ADMIN_AND_VIEW_PASSENGER)
	public List<NoteTypeVo> getAllNoteTypes();
	
	@PreAuthorize(PRIVILEGE_ADMIN)
	public void saveNoteType(NoteTypeVo noteTypeVo);
	
	@PreAuthorize(PRIVILEGE_ADMIN)
	public JsonServiceResponse deleteNoteType(Long id);

	@PreAuthorize(PRIVILEGE_ADMIN)
	public JsonServiceResponse editNoteType(NoteTypeVo noteTypeVo);

    NoteType getDeletedNoteType();

    @PreAuthorize(PRIVILEGE_ADMIN)
    public List<NoteTypeVo> getAllNonArchivedNoteTypes();
}
