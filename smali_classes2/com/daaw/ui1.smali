.class public Lcom/daaw/ui1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/bg;


# static fields
.field public static a:Lcom/daaw/ui1;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b()Lcom/daaw/ui1;
    .locals 1

    sget-object v0, Lcom/daaw/ui1;->a:Lcom/daaw/ui1;

    if-nez v0, :cond_0

    new-instance v0, Lcom/daaw/ui1;

    invoke-direct {v0}, Lcom/daaw/ui1;-><init>()V

    sput-object v0, Lcom/daaw/ui1;->a:Lcom/daaw/ui1;

    :cond_0
    sget-object v0, Lcom/daaw/ui1;->a:Lcom/daaw/ui1;

    return-object v0
.end method


# virtual methods
.method public a()J
    .locals 2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    return-wide v0
.end method
