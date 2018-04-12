package com.springinaction.knights;

import org.junit.Test;
import static org.mockito.Mockito.*;

public class BraveKnightTest{
	@Test
	public void knightShouldEmabrkOnQuest() {
		Quest mockQuest=mock(RescueDamselQuest.class);
		BraveKnight knight=new BraveKnight(mockQuest);
		knight.embarkOnQuest();
		verify(mockQuest,times(1)).embark();
	}
}