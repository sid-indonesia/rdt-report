package org.sidindonesia.rdtreport.controller;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.sidindonesia.rdtreport.IntegrationTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;

/**
 * Integration tests for {@link ExcelSheetController}.
 */
@IntegrationTest
@Transactional
class ExcelSheetControllerTests {

	private static final Long DEFAULT_ID = 1L;

	@Autowired
	private ExcelSheetController excelSheetController;


	@BeforeEach
	public void setUp() {
	}

	@AfterEach
	public void tearDown() {
	}

	@Test
	void testDownloadAllTablesAsExcelSheets_withHappyFlow() throws Exception {
		ResponseEntity<Resource> response = excelSheetController.downloadAllTablesAsExcelSheets();
		assertThat(response.getBody()).isInstanceOf(InputStreamResource.class);
	}
}