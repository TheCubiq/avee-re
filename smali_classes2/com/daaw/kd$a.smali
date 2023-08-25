.class public Lcom/daaw/kd$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/kd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# static fields
.field public static final p:Lcom/daaw/kd$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/kd$a;

    invoke-direct {v0}, Lcom/daaw/kd$a;-><init>()V

    sput-object v0, Lcom/daaw/kd$a;->p:Lcom/daaw/kd$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a()Lcom/daaw/kd$a;
    .locals 1

    sget-object v0, Lcom/daaw/kd$a;->p:Lcom/daaw/kd$a;

    return-object v0
.end method
