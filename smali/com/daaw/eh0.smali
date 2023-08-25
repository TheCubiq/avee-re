.class public Lcom/daaw/eh0;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/eh0$b;,
        Lcom/daaw/eh0$a;,
        Lcom/daaw/eh0$c;
    }
.end annotation


# static fields
.field public static a:Lcom/daaw/tw1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/tw1<",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/daaw/al;",
            ">;"
        }
    .end annotation
.end field

.field public static b:Lcom/daaw/tw1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/tw1<",
            "Landroid/content/Context;",
            "Ljava/lang/Long;",
            "Ljava/lang/String;",
            "Lcom/daaw/al;",
            ">;"
        }
    .end annotation
.end field

.field public static c:Lcom/daaw/tw1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/tw1<",
            "Landroid/content/Context;",
            "Ljava/lang/Long;",
            "Ljava/lang/String;",
            "Lcom/daaw/al;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/tw1;

    invoke-direct {v0}, Lcom/daaw/tw1;-><init>()V

    sput-object v0, Lcom/daaw/eh0;->a:Lcom/daaw/tw1;

    new-instance v0, Lcom/daaw/tw1;

    invoke-direct {v0}, Lcom/daaw/tw1;-><init>()V

    sput-object v0, Lcom/daaw/eh0;->b:Lcom/daaw/tw1;

    new-instance v0, Lcom/daaw/tw1;

    invoke-direct {v0}, Lcom/daaw/tw1;-><init>()V

    sput-object v0, Lcom/daaw/eh0;->c:Lcom/daaw/tw1;

    return-void
.end method
