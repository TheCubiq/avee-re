.class public Lcom/daaw/if0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/mq0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/if0$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<A:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/daaw/mq0<",
        "TA;",
        "Lcom/daaw/jf0;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lcom/daaw/mq0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/mq0<",
            "TA;",
            "Ljava/io/InputStream;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lcom/daaw/mq0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/mq0<",
            "TA;",
            "Landroid/os/ParcelFileDescriptor;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/daaw/mq0;Lcom/daaw/mq0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/mq0<",
            "TA;",
            "Ljava/io/InputStream;",
            ">;",
            "Lcom/daaw/mq0<",
            "TA;",
            "Landroid/os/ParcelFileDescriptor;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-nez p1, :cond_0

    const-string v0, "At least one of streamLoader and fileDescriptorLoader must be non null"

    invoke-static {p2, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    :cond_0
    iput-object p1, p0, Lcom/daaw/if0;->a:Lcom/daaw/mq0;

    iput-object p2, p0, Lcom/daaw/if0;->b:Lcom/daaw/mq0;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;II)Lcom/daaw/ip;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TA;II)",
            "Lcom/daaw/ip<",
            "Lcom/daaw/jf0;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/if0;->a:Lcom/daaw/mq0;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-interface {v0, p1, p2, p3}, Lcom/daaw/mq0;->a(Ljava/lang/Object;II)Lcom/daaw/ip;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    iget-object v2, p0, Lcom/daaw/if0;->b:Lcom/daaw/mq0;

    if-eqz v2, :cond_1

    invoke-interface {v2, p1, p2, p3}, Lcom/daaw/mq0;->a(Ljava/lang/Object;II)Lcom/daaw/ip;

    move-result-object p1

    goto :goto_1

    :cond_1
    move-object p1, v1

    :goto_1
    if-nez v0, :cond_3

    if-eqz p1, :cond_2

    goto :goto_2

    :cond_2
    return-object v1

    :cond_3
    :goto_2
    new-instance p2, Lcom/daaw/if0$a;

    invoke-direct {p2, v0, p1}, Lcom/daaw/if0$a;-><init>(Lcom/daaw/ip;Lcom/daaw/ip;)V

    return-object p2
.end method
