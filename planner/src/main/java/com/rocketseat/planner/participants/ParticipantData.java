package com.rocketseat.planner.participants;


import java.util.UUID;

public record ParticipantData(UUID id, String nome, String email, Boolean isConfirmed){}
