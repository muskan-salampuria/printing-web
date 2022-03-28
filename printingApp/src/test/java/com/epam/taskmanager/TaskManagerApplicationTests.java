package com.epam.taskmanager;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.epam.printing.TaskManagerApplication;

@SpringBootTest(classes=TaskManagerApplication.class)
class TaskManagerApplicationTests {
	
	@Test
	void main() {
		TaskManagerApplication.main(new String[] {});
	}

}
