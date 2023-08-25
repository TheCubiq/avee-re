.class public Lcom/daaw/vs0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/f70;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/vs0$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<R:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/daaw/f70<",
        "TR;>;"
    }
.end annotation


# static fields
.field public static final a:Lcom/daaw/vs0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/vs0<",
            "*>;"
        }
    .end annotation
.end field

.field public static final b:Lcom/daaw/g70;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/g70<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/vs0;

    invoke-direct {v0}, Lcom/daaw/vs0;-><init>()V

    sput-object v0, Lcom/daaw/vs0;->a:Lcom/daaw/vs0;

    new-instance v0, Lcom/daaw/vs0$a;

    invoke-direct {v0}, Lcom/daaw/vs0$a;-><init>()V

    sput-object v0, Lcom/daaw/vs0;->b:Lcom/daaw/g70;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic b()Lcom/daaw/vs0;
    .locals 1

    sget-object v0, Lcom/daaw/vs0;->a:Lcom/daaw/vs0;

    return-object v0
.end method

.method public static c()Lcom/daaw/f70;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">()",
            "Lcom/daaw/f70<",
            "TR;>;"
        }
    .end annotation

    sget-object v0, Lcom/daaw/vs0;->a:Lcom/daaw/vs0;

    return-object v0
.end method

.method public static d()Lcom/daaw/g70;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">()",
            "Lcom/daaw/g70<",
            "TR;>;"
        }
    .end annotation

    sget-object v0, Lcom/daaw/vs0;->b:Lcom/daaw/g70;

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/Object;Lcom/daaw/f70$a;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method
