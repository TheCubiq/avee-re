.class public final Lcom/daaw/dq3;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic p:Lcom/daaw/eq3;


# direct methods
.method public constructor <init>(Lcom/daaw/eq3;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/dq3;->p:Lcom/daaw/eq3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    iget-object p1, p0, Lcom/daaw/dq3;->p:Lcom/daaw/eq3;

    const-string p2, "User canceled the download."

    invoke-virtual {p1, p2}, Lcom/daaw/hq3;->c(Ljava/lang/String;)V

    return-void
.end method
