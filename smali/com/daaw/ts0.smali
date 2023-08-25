.class public final synthetic Lcom/daaw/ts0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Landroid/preference/Preference;

.field public final synthetic q:Lcom/daaw/us0;


# direct methods
.method public synthetic constructor <init>(Landroid/preference/Preference;Lcom/daaw/us0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/ts0;->p:Landroid/preference/Preference;

    iput-object p2, p0, Lcom/daaw/ts0;->q:Lcom/daaw/us0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/ts0;->p:Landroid/preference/Preference;

    iget-object v1, p0, Lcom/daaw/ts0;->q:Lcom/daaw/us0;

    invoke-static {v0, v1}, Lcom/daaw/us0;->a(Landroid/preference/Preference;Lcom/daaw/us0;)V

    return-void
.end method
