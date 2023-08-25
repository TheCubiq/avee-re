.class public final Lcom/daaw/yp3;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic p:Lcom/daaw/zp3;


# direct methods
.method public constructor <init>(Lcom/daaw/zp3;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/yp3;->p:Lcom/daaw/zp3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    iget-object p1, p0, Lcom/daaw/yp3;->p:Lcom/daaw/zp3;

    const-string p2, "Operation denied by user."

    invoke-virtual {p1, p2}, Lcom/daaw/hq3;->c(Ljava/lang/String;)V

    return-void
.end method
