.class public Lcom/daaw/oz$e;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/oz;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "e"
.end annotation


# static fields
.field public static a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public static b:Lcom/daaw/jw1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/jw1<",
            "Landroid/app/Activity;",
            "Ljava/lang/CharSequence;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    sput-object v0, Lcom/daaw/oz$e;->a:Ljava/util/List;

    new-instance v0, Lcom/daaw/jw1;

    invoke-direct {v0}, Lcom/daaw/jw1;-><init>()V

    new-instance v1, Lcom/daaw/oz$e$a;

    invoke-direct {v1}, Lcom/daaw/oz$e$a;-><init>()V

    sget-object v2, Lcom/daaw/oz$e;->a:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/jw1;->b(Lcom/daaw/jw1$a;Ljava/util/List;)Lcom/daaw/jw1;

    move-result-object v0

    sput-object v0, Lcom/daaw/oz$e;->b:Lcom/daaw/jw1;

    return-void
.end method
