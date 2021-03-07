package org.jesperancinha.java11.mastery4dot2.show;

import org.jesperancinha.java11.mastery4dot2.concert.Band;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.WeakHashMap;

// Guideline 6-1 / MUTABLE-1: Prefer immutability for value types
public final class SuperCristalBall {

    // Guideline 6-5 / MUTABLE-5: Do not trust identity equality when overridable on input reference objects
    private static final Map<PrivateKey, SuperCristalBall> cristalBalls = new WeakHashMap<>();

    // Guideline 6-5 / MUTABLE-5: Do not trust identity equality when overridable on input reference objects
    private static final Map<SuperCristalBall, String> cristalBallIdentities = new IdentityHashMap<>();

    // Guideline 6-1 / MUTABLE-1: Prefer immutability for value types
    private final String host;

    // Guideline 6-1 / MUTABLE-1: Prefer immutability for value types
    private final LocalDate localDate;

    // Guideline 6-1 / MUTABLE-1: Prefer immutability for value types
    private final LocalDateTime localDateTime;

    private final Date date;

    private final Band band;

    private final PrivateKey priv;

    private String comment;

    // Guideline 6-1 / MUTABLE-1: Prefer immutability for value types
    // Guideline 6-2 / MUTABLE-2: Create copies of mutable output values
    // Guideline 6-3 / MUTABLE-3: Create safe copies of mutable and subclassable input values
    // Guideline 6-4 / MUTABLE-4: Support copy functionality for a mutable class
    // Guideline 6-5 / MUTABLE-5: Do not trust identity equality when overridable on input reference objects
    private SuperCristalBall(final String host, final Date date, final Band band) throws NoSuchProviderException, NoSuchAlgorithmException {
        this.host = host;
        this.date = (Date) date.clone();
        this.band = new Band(band.getMembers(), band.getBandName());
        this.localDate = Instant.ofEpochMilli(date.getTime()).atZone(ZoneId.systemDefault()).toLocalDate();
        this.localDateTime = Instant.ofEpochMilli(date.getTime()).atZone(ZoneId.systemDefault()).toLocalDateTime();
        priv = createPrivateKey();
        cristalBallIdentities.put(this, this.host);
        cristalBalls.put(this.priv, this);
    }

    // Guideline 7-4 / OBJECT-4: Prevent constructors from calling methods that can be overridden
    private PrivateKey createPrivateKey() throws NoSuchAlgorithmException, NoSuchProviderException {
        final PrivateKey priv;
        KeyPairGenerator keyGen = KeyPairGenerator.getInstance("DSA", "SUN");
        KeyPair pair = keyGen.generateKeyPair();
        return pair.getPrivate();
    }

    // Guideline 7-1 / OBJECT-1: Avoid exposing constructors of sensitive classes
    public static SuperCristalBall createCristalBall(final String host, final Date date, final Band band) throws NoSuchProviderException, NoSuchAlgorithmException {
        return new SuperCristalBall(host, date, band);
    }

    public String getHost() {
        return host;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    // Guideline 6-2 / MUTABLE-2: Create copies of mutable output values
    public Date getDate() {
        return (Date) date.clone();
    }

    // Guideline 6-2 / MUTABLE-2: Create copies of mutable output values
    // Guideline 6-3 / MUTABLE-3: Create safe copies of mutable and subclassable input values
    public Date getDateSafeCopy() {
        return new Date(date.getTime());
    }

    // Guideline 6-2 / MUTABLE-2: Create copies of mutable output values
    // Guideline 6-3 / MUTABLE-3: Create safe copies of mutable and subclassable input values
    public Band getBand() {
        return new Band(band.getMembers(), band.getBandName());
    }

    // Guideline 6-2 / MUTABLE-2: Create copies of mutable output values
    // Guideline 6-3 / MUTABLE-3: Create safe copies of mutable and subclassable input values
    // Guideline 6-4 / MUTABLE-4: Support copy functionality for a mutable class
    public SuperCristalBall copy() throws NoSuchProviderException, NoSuchAlgorithmException {
        var cristalBall = new SuperCristalBall(host, getDate(), getBand());
        cristalBall.setComment(this.comment);
        return cristalBall;
    }

    public PrivateKey getPriv() {
        return priv;
    }

    public static SuperCristalBall getCristalBall(PrivateKey key) {
        return cristalBalls.get(key);
    }

    public static String getHost(SuperCristalBall key) {
        return cristalBallIdentities.get(key);
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "CristalBall{" +
                "host='" + host + '\'' +
                ", localDate=" + localDate +
                ", localDateTime=" + localDateTime +
                ", date=" + date +
                ", band=" + band +
                ", priv=" + priv +
                ", comment='" + comment + '\'' +
                '}';
    }

    public final void leaveEarth() {
        System.exit(1);
    }
}
