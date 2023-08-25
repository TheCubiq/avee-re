.class public Lcom/daaw/tn;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/tn$c;,
        Lcom/daaw/tn$a;,
        Lcom/daaw/tn$b;
    }
.end annotation


# static fields
.field public static a:Lcom/daaw/rw1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/rw1<",
            "Landroid/content/Context;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static b:Lcom/daaw/rw1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/rw1<",
            "Landroid/content/Context;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/rw1;

    invoke-direct {v0}, Lcom/daaw/rw1;-><init>()V

    sput-object v0, Lcom/daaw/tn;->a:Lcom/daaw/rw1;

    new-instance v0, Lcom/daaw/rw1;

    invoke-direct {v0}, Lcom/daaw/rw1;-><init>()V

    sput-object v0, Lcom/daaw/tn;->b:Lcom/daaw/rw1;

    return-void
.end method
