CREATE TABLE `REFERRAL` (
	referralId INT AUTO_INCREMENT PRIMARY KEY,
	enrollmentId INT,
	referralDate DATE,
	pathTypeProvided INT,
	referralOutcome INT,
	rhyTypeProvided INT
);