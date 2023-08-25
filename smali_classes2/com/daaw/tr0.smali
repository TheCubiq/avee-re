.class public final Lcom/daaw/tr0;
.super Lcom/daaw/u81;
.source ""


# static fields
.field public static final a:Lcom/daaw/tr0;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/tr0;

    invoke-direct {v0}, Lcom/daaw/tr0;-><init>()V

    sput-object v0, Lcom/daaw/tr0;->a:Lcom/daaw/tr0;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/daaw/u81;-><init>()V

    return-void
.end method


# virtual methods
.method public a()J
    .locals 2

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    return-wide v0
.end method
