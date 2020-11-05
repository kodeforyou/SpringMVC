package com.kodeforyou.spring.mvc.pdfviewresolverapp.view;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.kodeforyou.spring.mvc.pdfviewresolverapp.bean.Student;
import com.lowagie.text.Document;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Table;
import com.lowagie.text.pdf.PdfWriter;

public class StudentsPDFView extends AbstractPdfView {

	protected void buildPdfDocument(Map<String, Object> model, Document document, PdfWriter writer,
			HttpServletRequest request, HttpServletResponse response) throws Exception {

		List<Student> students = (List<Student>) model.get("students");
		
		Paragraph paragraph = null;
		if (students == null || students.isEmpty()) {
			paragraph = new Paragraph("No STUDENT DETAILS FOUND ");
			document.add(paragraph);
		} else {
			paragraph = new Paragraph("Student Details");
			paragraph.setAlignment("center");
			document.add(paragraph);

			Table table = new Table(3);
			table.addCell("ID");
			table.addCell("NAME");
			table.addCell("FEES");

			for (Student student : students) {
				table.addCell(student.getId() + "");
				table.addCell(student.getName());
				table.addCell(student.getFees() + "");
			}
			document.add(table);
		}
	}

}
